package com.hrsystem.userapi.service.impl;

import com.hrsystem.userapi.domain.User;
import com.hrsystem.userapi.repository.UserRepository;
import com.hrsystem.userapi.service.UserService;
import com.hrsystem.userapi.service.execeptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    private final Environment env;

    @Override
    public User findById(Long id) {
        log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object no found"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
