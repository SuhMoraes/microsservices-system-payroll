package com.hrsystem.userapi.resources.impl;

import com.hrsystem.userapi.domain.User;
import com.hrsystem.userapi.resources.UserResource;
import com.hrsystem.userapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/users")
public class UserResourceImpl implements UserResource {


    private final UserService userService;

    @Override
    public ResponseEntity<User> findById(Long id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(userService.findAll());
    }

    @Override
    public ResponseEntity<User> createUser(@RequestBody String name, String email, String password, double hourlyPrice) {
        return  ResponseEntity.ok().body(userService.createUser());
    }
}
