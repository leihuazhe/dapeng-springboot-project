package com.github.dapeng.demo.service;


import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    public void sayHello() {
        System.out.println("hello");
    }
}
