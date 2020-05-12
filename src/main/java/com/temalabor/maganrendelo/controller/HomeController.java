package com.temalabor.maganrendelo.controller;

import com.temalabor.maganrendelo.model.LoginData;
import com.temalabor.maganrendelo.model.User;
import com.temalabor.maganrendelo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class HomeController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index() { return "index"; }

}
