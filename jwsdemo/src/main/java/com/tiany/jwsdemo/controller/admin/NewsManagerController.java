package com.tiany.jwsdemo.controller.admin;

import com.tiany.jwsdemo.entity.News;
import com.tiany.jwsdemo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class NewsManagerController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/newsList")
    public String userList(Model model) {
        List<News> newsList = newsService.newsList();
        model.addAttribute("newsList", newsList);
        return "admin/news/newsList";
    }


    @GetMapping("/toAddNews")
    public String toAddNews() {
        return "admin/news/addNews";
    }

    @PostMapping("/doAddNews")
    public String doAddNews(HttpServletRequest request, Model model) {
        News news = new News();
        news.setTitle(request.getParameter("title"));
        news.setAuthor(request.getParameter("author"));
        news.setBreif(request.getParameter("brief"));
        news.setTime(request.getParameter("time"));
        news.setContent(request.getParameter("content"));
        news.setIs_delete(0);
        news.setNumber(0);

        newsService.addNews(news);
        model.addAttribute("news", news);
        return "redirect:/admin/newsList";
    }

    @GetMapping("/newsDetail/{id}")
    public String newsDetail(@PathVariable("id") int id, Model model) {
        News news = newsService.newsDetail(id);
        model.addAttribute("news", news);
        return "admin/news/newsDetail";
    }

    @GetMapping("/deleteNews/{id}")
    public String deleteNews(@PathVariable("id") int id) {
        newsService.deleteNews(id);
        return "redirect:/admin/newsList";
    }

    @GetMapping("toUpdateNews/{id}")
    public String toUpdateNews(@PathVariable("id") int id, Model model) {
        News news = newsService.newsDetail(id);
        model.addAttribute("news", news);
        return "admin/news/updateNews";
    }

    @PostMapping("doUpdateNews/{id}")
    public String doUpdateNews(@PathVariable("id") int id,HttpServletRequest request)
    {
        News news = newsService.newsDetail(id);
        news.setTitle(request.getParameter("title"));
        news.setAuthor(request.getParameter("author"));
        news.setBreif(request.getParameter("brief"));
        news.setTime(request.getParameter("time"));
        news.setContent(request.getParameter("content"));

        newsService.updateNews(news);
        return "redirect:/admin/newsList";
    }

}
