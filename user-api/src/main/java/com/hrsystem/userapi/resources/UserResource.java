package com.hrsystem.userapi.resources;

import com.hrsystem.userapi.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserResource {

    @GetMapping("/{id}")
    ResponseEntity<User> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<User>> findAll();

    @PostMapping
    ResponseEntity<User> createUser(@RequestBody String name, String email, String password, double hourlyPrice);

}
