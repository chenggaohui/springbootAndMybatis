package com.hhh.springbootmybatis.service;

import com.hhh.springbootmybatis.pojo.User;

import java.util.List;

public interface UserService {
    User getUserByUserName(String userName);
    List<User> getUsers();
}
