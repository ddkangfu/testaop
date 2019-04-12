package com.ddkangfu.service.impl;

import com.ddkangfu.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        if (name == null || "".equals(name.trim())) {
            throw new RuntimeException("Parameter is null!");
        }
        System.out.println("hello" + name);
    }

    @Override
    public void laugh() {
        System.out.println("hahahaha......");
    }
}
