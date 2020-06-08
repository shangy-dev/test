package com.shangy.sy.controller;

import com.shangy.sy.entity.User;
import com.shangy.sy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("test")
    private Object test(){
        return userService.test();
    }
    @RequestMapping("test1")
    private Object test1(){
        return userService.test1();
    }
    @RequestMapping("insert")
    private int insert(User user){
        return userService.insert(user);
    }
}
