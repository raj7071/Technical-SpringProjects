package com.microproj.rest.restfulwebservices.user;


import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.microproj.rest.restfulwebservices.jpa.PostRepository;
import com.microproj.rest.restfulwebservices.jpa.UserRepository;

import jakarta.validation.Valid;

@RestController
public class UserJpaResource {

	
	private UserRepository userRepository;
	
	private PostRepository postRepository;
	
	public UserJpaResource(UserRepository repository,PostRepository postRepository) {
	
		this.userRepository= repository;
		this.postRepository = postRepository;
	}
	
	
	//GET 
	@GetMapping("jpa/users")
	public List<User> retrieveAllUsers(){
		return userRepository.findAll();
	}
	
	//http://localhost:8080/users
	
	//EntityModel
	//WebMvcLinkBuilder
	
	//GET 
	
	@GetMapping("/jpa/users/{id}")
	public EntityModel<User> retrieveUser(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);
		
		if(user.isEmpty())
			throw new UserNotFoundException("id:"+id);
		
		EntityModel<User> entityModel = EntityModel.of(user.get());
		
		WebMvcLinkBuilder link =  linkTo(methodOn(this.getClass()).retrieveAllUsers());
		entityModel.add(link.withRel("all-users"));
		
		return entityModel;
	}
	
	
	@GetMapping("/jpa/users/{id}/posts")
	public List<Post> retrievePostsForUser(@PathVariable int id) {
		Optional<User> user = userRepository.findById(id);
		
		if(user.isEmpty())
			throw new UserNotFoundException("id:"+id);
		
		return user.get().getPosts();

	}
		
		
		
		//DELETE
		@DeleteMapping("jpa/users/{id}")
		public void deleteUsers(@PathVariable int id){
			userRepository.deleteById(id);
		
		}
		
		
		
		
		//POST /users
		@PostMapping("jpa/users")
		public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
			User savedUser = userRepository.save(user);
			// /users/4 => /users/{id}, user.getID
			URI location = ServletUriComponentsBuilder.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(savedUser.getId())
					.toUri();
			
			return ResponseEntity.created(location).build();
		}

		
		@PostMapping("/jpa/users/{id}/posts")
		public ResponseEntity<Object> createPostForUser(@PathVariable int id, @Valid @RequestBody Post post) {
			Optional<User> user = userRepository.findById(id);
			
			if(user.isEmpty())
				throw new UserNotFoundException("id:"+id);
			
			post.setUser(user.get());
			
			Post savedPost = postRepository.save(post);
			
			URI location = ServletUriComponentsBuilder.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(savedPost.getId())
					.toUri();   

			return ResponseEntity.created(location).build();

		}
		
}
