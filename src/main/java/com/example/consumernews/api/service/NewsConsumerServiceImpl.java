package com.example.consumernews.api.service;

import com.example.consumernews.api.dto.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NewsConsumerServiceImpl implements NewsConsumerService {


    @Value("${consumer.news.url}")
    private String url;

    @Value("${accessTokenUri}")
    private String accessTokenUri;

    @Value("${clientID}")
    private String clientID;

    @Value("${clientSecret}")
    private String clientSecret;


    @Autowired
    RestTemplate restTemplate;

    public List<News> getAllNews(){
        List<News> news=restTemplate.getForObject(url,List.class);
        return news;
    }

    //TODO set in header basic auth to get on access token


}
