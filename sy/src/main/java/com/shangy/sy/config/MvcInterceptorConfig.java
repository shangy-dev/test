package com.shangy.sy.config;

import com.shangy.sy.utils.IpHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class MvcInterceptorConfig extends WebMvcConfigurationSupport {
    @Autowired
    private IpHandlerInterceptor ipHandlerInterceptor;
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则，/**表示拦截所有请求
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(ipHandlerInterceptor).addPathPatterns("/**")
                //.excludePathPatterns("/test/test","/test/hello");
                .excludePathPatterns("/test/test");
        super.addInterceptors(registry);
    }
}
