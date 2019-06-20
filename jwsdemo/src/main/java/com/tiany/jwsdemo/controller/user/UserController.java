package com.tiany.jwsdemo.controller.user;

import com.tiany.jwsdemo.entity.User;
import com.tiany.jwsdemo.entity.UserExample;
import com.tiany.jwsdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 用户登录注册控制器
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/toRegister")
    public String toRegister()
    {
        return "user/register";
    }

    @PostMapping("/doRegister")
    public String doRegister(HttpServletRequest request, Model model)
    {
        User user = new User();
        user.setEmail(request.getParameter("email"));
        user.setPhone(request.getParameter("phone"));
        user.setName(request.getParameter("name"));
        user.setPassword(request.getParameter("password"));
        user.setIs_delete(0);
        System.out.println(user);
        userService.register(user);
        model.addAttribute("user",user);

        return "user/login";

    }

    @GetMapping("/toLogin")
    public String toLogin()
    {
        return "user/login";
    }

    @PostMapping("/doLogin")
    public String doLogin(HttpServletRequest request, Model model, HttpSession session)
    {
        UserExample example = new UserExample();

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        example = userService.login(email,password);
        session.setAttribute("userSession", example);
        model.addAttribute("user",example);

        return "user/index";

    }
}
