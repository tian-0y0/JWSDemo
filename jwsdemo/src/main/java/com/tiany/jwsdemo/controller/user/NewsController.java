package com.tiany.jwsdemo.controller.user;

import com.tiany.jwsdemo.entity.News;
import com.tiany.jwsdemo.service.NewsService;
import com.tiany.jwsdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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


}