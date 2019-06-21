package com.tiany.jwsdemo.service;

import com.tiany.jwsdemo.entity.News;

import java.util.List;

public interface NewsService {

    List<News> newsList();

    int addNews(News news);

    int deleteNews(int id);

    News newsDetail(int id);

    int updateNews(News news);



}
