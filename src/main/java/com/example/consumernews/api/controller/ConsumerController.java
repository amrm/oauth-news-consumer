package com.example.consumernews.api.controller;

import com.example.consumernews.api.service.NewsConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api")
public class ConsumerController {

    @Autowired
    NewsConsumerService newsConsumerService;

    @GetMapping("/consumer/news")
    public ResponseEntity<?> getNews(){

        return new ResponseEntity<List>(newsConsumerService.getAllNews(), OK);
    }
}
