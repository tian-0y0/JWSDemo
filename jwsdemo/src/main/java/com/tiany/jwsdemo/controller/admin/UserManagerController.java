package com.tiany.jwsdemo.controller.admin;

import com.tiany.jwsdemo.entity.User;
import com.tiany.jwsdemo.service.AdminService;
import com.tiany.jwsdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.List;

/**
 * 管理员用户管理控制器
 */

@Controller
@RequestMapping("/admin")
public class UserManagerController {

    @Autowired
    private UserService userService;

    @GetMapping("/userList")
    public String userList(Model model)
    {
        List<User> userList = userService.userList();
        model.addAttribute("userList",userList);
        return "admin/users/userList";
    }

    @GetMapping("/userDetail/{id}")
    public String userDetail(@PathVariable("id") int id, Model model)
    {
        User user = userService.userDetail(id);
        model.addAttribute("user",user);
        return "admin/users/userDetail";
    }


}
