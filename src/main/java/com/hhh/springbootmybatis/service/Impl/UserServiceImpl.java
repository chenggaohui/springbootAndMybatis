package com.hhh.springbootmybatis.service.Impl;

import com.hhh.springbootmybatis.dao.UserMapper;
import com.hhh.springbootmybatis.pojo.User;
import com.hhh.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getUserByUserName(String userName) {
        return userMapper.getUserByUserName(userName);
    }

    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }
}
