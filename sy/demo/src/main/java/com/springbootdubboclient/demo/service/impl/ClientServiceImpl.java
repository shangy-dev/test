package com.springbootdubboclient.demo.service.impl;

import com.shangy.springbootdubboapi.service.TestService;
import com.springbootdubboclient.demo.service.ClientService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    @Reference(interfaceClass = TestService.class, loadbalance = "random", cluster = "failover",retries = 3, version = "1.0")
    private TestService testService;
    @Override
    public Object test() {
        return testService.test();
    }
}
