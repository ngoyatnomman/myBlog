package com.shy.mapper;

import com.shy.pojo.Article;
import com.shy.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserMapper {
    @Select("SELECT * FROM users WHERE username=#{username} AND `password`=#{password}")
    User login(@Param("username") String username, @Param("password") String password);

    @Select("SELECT * FROM blogs WHERE userid=#{userId}")
    List<Article> getArticlesFrmUserId(int userId);

    @Select("select * from blogs")
    List<Article> getArticles();
}
