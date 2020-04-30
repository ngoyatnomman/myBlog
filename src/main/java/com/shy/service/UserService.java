package com.shy.service;

import com.shy.mapper.UserMapper;
import com.shy.pojo.Article;
import com.shy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper mapper;

    public User login(String userName, String password){
        return mapper.login(userName,password);
    }

    public List<Article> getArticlesFrmUserId(int userId){
        return mapper.getArticlesFrmUserId(userId);
    }

    public List<Article> getArticles() {
        return mapper.getArticles();
    }
}
