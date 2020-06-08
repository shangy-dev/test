package com.springbootdubboclient.demo.controller;

import com.shangy.springbootdubboapi.service.TestService;
import com.springbootdubboclient.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class TestController {
    @Autowired
    private ClientService clientService;
    @RequestMapping("test")
    private Object test(){
        return clientService.test();
    }
}
