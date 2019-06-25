package com.tiany.jwsdemo.controller.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tiany.jwsdemo.entity.News;
import com.tiany.jwsdemo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class NewsManagerController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/newsList")
    public String userList(Model model,
                            @RequestParam(required = false,defaultValue="1",value="pageNum")Integer pageNum,
                            @RequestParam(defaultValue="2",value="pageSize")Integer pageSize)
    {

        if(pageNum == null){
            pageNum = 1;   //设置默认当前页
        }
        if(pageNum <= 0){
            pageNum = 1;
        }
        if(pageSize == null){
            pageSize = 2;    //设置默认每页显示的数据数
        }
        System.out.println("当前页是："+pageNum+"显示条数是："+pageSize);
        PageHelper.startPage(pageNum,pageSize);
        List<News> newsList = newsService.newsList();
        PageInfo<News> newsPageInfo = new PageInfo<>(newsList,pageSize);
        model.addAttribute("newsList", newsList);
        model.addAttribute("newsPageInfo",newsPageInfo);

        PageHelper.clearPage(); //清理 ThreadLocal 存储的分页参数,保证线程安全

        return "admin/news/newsList";
        //return newsPageInfo;
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
