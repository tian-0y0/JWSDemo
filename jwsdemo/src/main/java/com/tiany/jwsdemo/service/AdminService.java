package com.tiany.jwsdemo.service;

import com.tiany.jwsdemo.entity.Admin;
import com.tiany.jwsdemo.entity.AdminExample;
import com.tiany.jwsdemo.entity.User;
import com.tiany.jwsdemo.entity.UserExample;

import java.util.List;

public interface AdminService {

    int register(Admin admin);

    AdminExample login(String username, String password);



}
