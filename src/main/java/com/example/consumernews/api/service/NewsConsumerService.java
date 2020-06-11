package com.example.consumernews.api.service;

import com.example.consumernews.api.dto.News;

import java.util.List;

public interface NewsConsumerService {
    List<News> getAllNews();
}
