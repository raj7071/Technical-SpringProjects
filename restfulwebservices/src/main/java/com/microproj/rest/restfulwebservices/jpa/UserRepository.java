package com.microproj.rest.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microproj.rest.restfulwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
