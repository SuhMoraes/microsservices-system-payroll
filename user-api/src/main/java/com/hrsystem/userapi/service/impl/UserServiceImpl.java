package com.hrsystem.userapi.service.impl;

import com.hrsystem.userapi.domain.User;
import com.hrsystem.userapi.repository.UserRepository;
import com.hrsystem.userapi.service.UserService;
import com.hrsystem.userapi.service.execeptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object no found"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
