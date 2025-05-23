package com.microproj.rest.restfulwebservices.user;


import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.net.URI;
import java.util.List;

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

import jakarta.validation.Valid;

@RestController
public class UserResource {

	private UserDAOService service;
	
	public UserResource(UserDAOService service) {
		this.service = service;
	}
	
	
	//GET 
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
	}
	
	//http://localhost:8080/users
	
	//EntityModel
	//WebMvcLinkBuilder
	
	//GET 
		@GetMapping("/users/{id}")
		public EntityModel<User> retrieveUsers(@PathVariable int id){
			User user = service.findOne(id);
		
			if(user == null) 
				throw new UserNotFoundException("id:"+id);
			
			
			EntityModel<User> entityModel = EntityModel.of(user);
			

			WebMvcLinkBuilder link =  linkTo(methodOn(this.getClass()).retrieveAllUsers());
			entityModel.add(link.withRel("all-users"));
			
		    return entityModel;
		}
		
		
		
		
		//DELETE
		@DeleteMapping("/users/{id}")
		public void deleteUsers(@PathVariable int id){
			service.deleteById(id);
		
		}
		
		//POST /users
		@PostMapping("/users")
		public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
			User savedUser = service.save(user);
			// /users/4 => /users/{id}, user.getID
			URI location = ServletUriComponentsBuilder.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(savedUser.getId())
					.toUri();
			
			return ResponseEntity.created(location).build();
		}
	
}
