package com.temalabor.maganrendelo.controller;

import com.temalabor.maganrendelo.model.User;
import com.temalabor.maganrendelo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> users() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public User findUser(@PathVariable String id) {
        return userRepository.findById(Integer.parseInt(id));
    }

}
