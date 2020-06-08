package com.shangy.sy.service.impl;

import com.shangy.sy.service.TestService;
import com.shangy.sy.utils.HttpIpUtil;
import com.shangy.sy.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public ResponseUtil test(HttpServletRequest httpServletRequest) {
        return new ResponseUtil(200,"ok","测试ok,ip为"+HttpIpUtil.getRealIp(httpServletRequest));
    }

    @Override
    public ResponseUtil hello() {
        return new ResponseUtil(200,"ok","hello!!!");
    }
}
