package com.cc.config;

import com.cc.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @descriptions:
 * @author: cc
 * @date: 2023/6/10 13:22
 * @version: 1.0
 */

/*
 * 配置类，基于Java代码的bean配置
 * */

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {
    private HelloProperties helloProperties;

    //通过构造方法注入配置属性对象HelloProperties
    public HelloServiceAutoConfiguration(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    //实例化HelloService并载入Spring IoC容器
    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService(){
        return new HelloService(helloProperties.getName(),helloProperties.getAddress());
    }
}
