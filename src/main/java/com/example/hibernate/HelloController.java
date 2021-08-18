package com.example.hibernate;

import com.example.hibernate.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @Autowired
    UserDao userDao;

    @GetMapping("/")
    public String index() {
        userDao.save();
        return "Greetings from Spring Boot";
    }
}
