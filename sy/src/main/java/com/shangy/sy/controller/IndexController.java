package com.shangy.sy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("index")
public class IndexController {
    @RequestMapping("index")
    private String index(){
        return "/index";
    }
}
