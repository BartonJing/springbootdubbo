package com.barton.springdubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.barton.springdubboapi.service.TestService;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test(String consumer) {
        System.out.println(consumer);
        return consumer;
    }
}
