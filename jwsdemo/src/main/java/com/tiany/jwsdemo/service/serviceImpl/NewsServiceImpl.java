package com.tiany.jwsdemo.service.serviceImpl;

import com.tiany.jwsdemo.dao.NewsMapper;
import com.tiany.jwsdemo.entity.News;
import com.tiany.jwsdemo.entity.NewsExample;
import com.tiany.jwsdemo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> newsList() {
        NewsExample example = new NewsExample();
        example.createCriteria().andIs_deleteEqualTo(0);
        List<News> newsList = newsMapper.selectByExample(example);
        return newsList;
    }

    @Override
    public int addNews(News news) {
        int count = 0;
        count = newsMapper.insert(news);
        return count;
    }

    @Override
    public int deleteNews(int id) {
        int count = 0;
        count = newsMapper.logicalDeleteByPrimaryKey(id);
        return count;
    }

    @Override
    public News newsDetail(int id) {
        News news = newsMapper.selectByPrimaryKey(id);
        return news;
    }

    @Override
    public int updateNews(News news) {
        int count = 0;

        count = newsMapper.updateByPrimaryKey(news);

        return count;
    }
}
