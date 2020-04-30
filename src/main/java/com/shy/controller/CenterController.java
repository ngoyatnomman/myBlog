package com.shy.controller;

import com.shy.pojo.Article;
import com.shy.pojo.User;
import com.shy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CenterController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public User login(String username, String password) {
        return userService.login(username,password);
    }

    @PostMapping("/getArticles")
    public List<Article> getArticles(){
        return userService.getArticles();
    }
}
