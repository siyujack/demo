package com.example.demo.service;

import com.example.demo.entity.Student;

public interface TestService {

    Student testOne(String orderno);

    Object getFromRedis(String orderno);

}

