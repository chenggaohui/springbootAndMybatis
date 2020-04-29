package com.hhh.springbootmybatis.controller;

import com.hhh.springbootmybatis.pojo.User;
import com.hhh.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUserByUserName/{userName}")
    public User getUserByUserName(@PathVariable  String userName){
        System.out.println("UserName~~~~~:"+userName);
        return userService.getUserByUserName(userName);
    }
    @RequestMapping("/getUsers")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
