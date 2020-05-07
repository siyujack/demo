package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.service.HelloService;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;
    @Autowired
    private HelloService helloService;

    @RequestMapping("/get")
    public String test(@RequestParam("orderNo") String orderNo) {
        return JSON.toJSONString(testService.testOne(orderNo));
    }

    @RequestMapping("/getFromRedis")
    public String getFromRedis(@RequestParam("orderNo") String orderNo) {
        return JSON.toJSONString(testService.getFromRedis(orderNo));
    }

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam("str") String str){
        return JSON.toJSONString(helloService.sayHello(str));
    }

}
