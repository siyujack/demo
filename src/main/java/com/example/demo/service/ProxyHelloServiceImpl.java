package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ProxyHelloServiceImpl implements HelloService {
    private HelloService helloService;
    public ProxyHelloServiceImpl(HelloService helloService){
        super();
        this.helloService =helloService;
    }

    @Override
    public String sayHello(String str){return  "";}

    @Override
    public void sayHello(int i){
        helloService.sayHello(1);
    }
}
