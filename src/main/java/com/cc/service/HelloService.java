package com.cc.service;

/**
 * @descriptions:
 * @author: cc
 * @date: 2023/6/10 13:21
 * @version: 1.0
 */

public class HelloService {
    private String name;
    private String address;

    public HelloService(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String sayHello(){
        return "你好！我的名字叫 " + name + "，我来自 " + address;
    }
}
