package com.example.consumernews.api.dto;

import java.io.Serializable;

public class News implements Serializable {

    private Long id;
    private String topic;
    private String title;

    public News(){

    }

    public News(Long id, String title, String topic){
        this.id=id;
        this.title=title;
        this.topic=topic;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


