package com.shangy.springbootdubboapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping("test")
    public Object test(){
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        return list;
    }
}
