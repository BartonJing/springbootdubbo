package com.barton.springdubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.barton.springdubboapi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Reference
    private TestService testService;
    @RequestMapping("/save")
    public String saveUser() {
        return testService.test("consumer_test");
    }
}
