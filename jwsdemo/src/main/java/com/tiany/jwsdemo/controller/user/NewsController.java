package com.tiany.jwsdemo.controller.user;

import com.tiany.jwsdemo.entity.News;
import com.tiany.jwsdemo.service.NewsService;
import com.tiany.jwsdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class NewsController {

    @Autowired
    private NewsService newsService;


    @GetMapping("/newsList")
    public String newsList(Model model)
    {
        List<News> newsList =  newsService.newsList();
        model.addAttribute("newsList",newsList);
        return "user/news/newsList";
    }

    @GetMapping("/newsDetail/{id}")
    @ResponseBody
    public News newsDetail(@PathVariable("id") int id, Model model) {
        News news = newsService.newsDetail(id);
        model.addAttribute("news", news);
        return news;
    }

    @PostMapping("/news/count/{id}")
    @ResponseBody
    public News count(@PathVariable("id") int id)
    {
        News news = newsService.newsDetail(id);
        int number = news.getNumber();
        number+=1;
        news.setNumber(number);
        newsService.updateNews(news);
        return news;
    }


}
