package com.shangy.sy.controller;

import com.shangy.sy.service.EsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("es")
public class EsController {
    @Autowired
    private EsService esService;
    @RequestMapping("test")
    public Object test(){
        return esService.test();
    }
}
