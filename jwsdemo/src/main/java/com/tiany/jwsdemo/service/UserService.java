package com.tiany.jwsdemo.service;

import com.tiany.jwsdemo.entity.User;
import com.tiany.jwsdemo.entity.UserExample;

import java.util.List;

public interface UserService {

    int register(User user);

    User login(String email,String password);

    List<User> userList();

    User userDetail(int id);

    int deleteUser(int id);

}
