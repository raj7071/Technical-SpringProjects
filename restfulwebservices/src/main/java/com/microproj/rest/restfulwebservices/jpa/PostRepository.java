package com.microproj.rest.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microproj.rest.restfulwebservices.user.Post;
import com.microproj.rest.restfulwebservices.user.User;

import jakarta.validation.Valid;

public interface PostRepository extends JpaRepository<Post, Integer>{

	//Post save(@Valid Post post);

}
