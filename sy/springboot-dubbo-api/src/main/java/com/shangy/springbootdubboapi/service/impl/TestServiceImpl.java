package com.shangy.springbootdubboapi.service.impl;

import com.shangy.springbootdubboapi.service.TestService;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
@Service(interfaceClass = TestServiceImpl.class, loadbalance = "roundrobin", weight = 60,
        cluster = "failover", retries = 3, version = "1.0")
public class TestServiceImpl implements TestService {
    @Override
    public Object test() {
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        return list;
    }
}
