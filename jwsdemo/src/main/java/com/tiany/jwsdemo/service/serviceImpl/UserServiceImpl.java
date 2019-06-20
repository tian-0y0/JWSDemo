package com.tiany.jwsdemo.service.serviceImpl;

import com.tiany.jwsdemo.dao.UserMapper;
import com.tiany.jwsdemo.entity.AdminExample;
import com.tiany.jwsdemo.entity.User;
import com.tiany.jwsdemo.entity.UserExample;
import com.tiany.jwsdemo.service.UserService;
import com.tiany.jwsdemo.util.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int register(User user) {
        if (isExistEmail(user.getEmail().toLowerCase()))
        {
            throw new MyException("该邮箱已存在");
        }
        if (isExistPhone(user.getPhone().toLowerCase()))
        {
            throw new MyException("该电话号已存在");
        }
        if (isExistName(user.getName().toLowerCase()))
        {
            throw new MyException("该昵称已存在");
        }

        int count = 0;
        count = userMapper.insert(user);
        System.out.println("================="+count+"===================");
        return count;
    }

    @Override
    public UserExample login(String email, String password) {
        UserExample example = new UserExample();
        example.createCriteria().andEmailEqualTo(email);
        example.createCriteria().andPasswordEqualTo(password);

        userMapper.selectByExample(example);
        return example;
    }

    public boolean isExistEmail(String email) {
        UserExample example = new UserExample();
        example.createCriteria().andEmailEqualTo(email);
        long count = userMapper.countByExample(example);
        if (count > 0)
        {
            return true;
        }
        return false;
    }

    public boolean isExistPhone(String phone)
    {
        UserExample example = new UserExample();
        example.createCriteria().andPhoneEqualTo(phone);
        long count = userMapper.countByExample(example);
        if (count > 0)
        {
            return true;
        }
        return false;
    }

    public boolean isExistName(String name)
    {
        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo(name);
        long count = userMapper.countByExample(example);
        if (count > 0)
        {
            return true;
        }
        return false;
    }


    @Override
    public List<User> userList() {
        UserExample example = new UserExample();
        example.createCriteria().andIs_deleteEqualTo(0);
        return userMapper.selectByExample(example);

    }

    @Override
    public User userDetail(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public int deleteUser(int id) {
        int count = 0;
        count = userMapper.logicalDeleteByPrimaryKey(id);
        return count;
    }


}
