package com.shangy.sy.service;

import com.shangy.sy.utils.ResponseUtil;

import javax.servlet.http.HttpServletRequest;

public interface TestService {
    ResponseUtil test(HttpServletRequest httpServletRequest);

    ResponseUtil hello();
}
