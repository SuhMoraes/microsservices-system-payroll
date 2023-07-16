package com.hrsystem.userapi.service;

import com.hrsystem.userapi.domain.User;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();

    User createUser();


    User createUser(@RequestBody String name, String email, String password, double hourlyPrice);
}
