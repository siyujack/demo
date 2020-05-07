package com.example.demo.service;

import com.example.demo.dao.StudentMapper;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Student testOne(String orderno) {
        redisTemplate.opsForValue().set(orderno, "redis数据如下：" + orderno);
        return studentMapper.getOne(orderno);
    }

    @Override
    public Object getFromRedis(String orderno) {
        return redisTemplate.opsForValue().get(orderno);
    }
}
