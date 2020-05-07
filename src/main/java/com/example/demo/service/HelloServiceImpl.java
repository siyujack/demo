package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHello(String str){
        if(str.equals("Y")){
            return  "SB";
        }
        else{
          return  "JB";
        }
    }

    @Override
    public void sayHello(int i){
        if(i == 1){
           System.out.println("Hello SB");
        }
        else{
            System.out.println("Hello JB");
        }
    }
}
