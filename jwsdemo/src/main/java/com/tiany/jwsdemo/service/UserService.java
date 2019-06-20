package com.tiany.jwsdemo.service;

import com.tiany.jwsdemo.entity.User;
import com.tiany.jwsdemo.entity.UserExample;

import java.util.List;

public interface UserService {

    int register(User user);

    UserExample login(String email,String password);

    List<User> userList();

    User userDetail(int id);

}