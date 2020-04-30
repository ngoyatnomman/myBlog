package com.shy.pojo;

import org.springframework.stereotype.Component;
import java.io.Serializable;

@Component
public class Article implements Serializable {
    private Integer id;
    private String title;
    private String article;
    private String modifyTime;
    private Integer readTimes;

    public Article(Integer id, String title, String article, String modifyTime, Integer readTimes) {
        this.id = id;
        this.title = title;
        this.article = article;
        this.modifyTime = modifyTime;
        this.readTimes = readTimes;
    }

    public Article() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getReadTimes() {
        return readTimes;
    }

    public void setReadTimes(Integer readTimes) {
        this.readTimes = readTimes;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", article='" + article + '\'' +
                ", modifyTime='" + modifyTime + '\'' +
                ", readTimes=" + readTimes +
                '}';
    }
}
