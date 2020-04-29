package com.hhh.springbootmybatis.dao;

import com.hhh.springbootmybatis.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    User getUserByUserName(String userName);

    List<User> getUsers();
}
