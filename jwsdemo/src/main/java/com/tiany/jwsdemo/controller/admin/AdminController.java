package com.tiany.jwsdemo.controller.admin;

import com.tiany.jwsdemo.entity.Admin;
import com.tiany.jwsdemo.entity.AdminExample;
import com.tiany.jwsdemo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 管理员登录注册控制器
 */

@Controller
@RequestMapping("/admin")
public class AdminController
{
    @Autowired
    private AdminService adminService;

    @GetMapping("/toRegister")
    public String toRegister() { return "admin/register"; }



    @PostMapping("/doRegister")
    public String doRegister(HttpServletRequest request, Model model) {
        Admin admin = new Admin();
        admin.setUsername(request.getParameter("username"));
        admin.setPassword(request.getParameter("password"));
        admin.setName(request.getParameter("name"));

        System.out.println(admin);
        System.out.println(admin.getId());

        adminService.register(admin);

        model.addAttribute("admin", admin);

        return "admin/index";
    }




    @GetMapping("toLogin")
    public String toLogin() { return "admin/login"; }




    @PostMapping("doLogin")
    public String doLogin(HttpServletRequest request, Model model, HttpSession session) {
        Admin admin = new Admin();
        AdminExample example = new AdminExample();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        example = adminService.login(username, password);
        session.setAttribute("adminSession", example);
        model.addAttribute("admin", example);
        return "admin/index";
    }

    @GetMapping("index")
    public String main()
    {
        return "admin/index";
    }

}
