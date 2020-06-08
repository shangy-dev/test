package com.shangy.sy.controller;

import com.shangy.sy.service.TestService;
import com.shangy.sy.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping("test")
    public ResponseUtil test(HttpServletRequest httpServletRequest) {
        return testService.test(httpServletRequest);
    }
    @RequestMapping("hello")
    public ResponseUtil hello(){
        return testService.hello();
    }
}
