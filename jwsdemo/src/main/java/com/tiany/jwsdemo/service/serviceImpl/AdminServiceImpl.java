package com.tiany.jwsdemo.service.serviceImpl;

import com.tiany.jwsdemo.dao.AdminMapper;
import com.tiany.jwsdemo.dao.UserMapper;
import com.tiany.jwsdemo.entity.Admin;
import com.tiany.jwsdemo.entity.AdminExample;
import com.tiany.jwsdemo.entity.User;
import com.tiany.jwsdemo.entity.UserExample;
import com.tiany.jwsdemo.service.AdminService;
import com.tiany.jwsdemo.util.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private UserMapper userMapper;

    public int register(Admin admin) {
        if (isExistUsername(admin.getUsername().toLowerCase()))
        {
            throw new MyException("该登录名已被注册");
        }

        int count = 0;
        count = adminMapper.insert(admin);
        System.out.println("====================" + count + "======================");
        return count;
    }



    public AdminExample login(String username, String password) {
        AdminExample example = new AdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        example.createCriteria().andPasswordEqualTo(password);

        adminMapper.selectByExample(example);

        return example;
    }

    public boolean isExistUsername(String username) {
        AdminExample example = new AdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        long count = adminMapper.countByExample(example);
        if (count > 0)
        {
            return true;
        }


        return false;
    }
}
