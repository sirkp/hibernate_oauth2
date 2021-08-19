package com.example.hibernate;

import java.util.List;

import com.example.hibernate.dao.UserDao;
import com.example.hibernate.entities.UserEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @Autowired
    UserDao userDao;

    @GetMapping("/")
    public List<UserEntity>index() {
        // userDao.save();
        UserEntity entity = userDao.getUserByUserName("pradeep@mail.com");
        return userDao.getAll();
        // return "Greetings from Spring Boot";
    }
}
