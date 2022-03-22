package com.will.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author maolingwei
 * @Date 2022-02-11 8:51 PM
 * @Version 1.0
 **/
@RestController
@RequestMapping("nacos")
@RefreshScope // 刷新
public class NacosController {

    @Value("${nacos.demo.name}")
    private String name;

    @Value("${nacos.demo.age}")
    private int age;

    @Value("${will.mysql.common}")
    private String mysql;

    @Value("${will.redis.common}")
    private String redis;

    @Value("${will.mao.config}")
    private String mao;

    @GetMapping("getMaoConfig")
    public String getMaoConfig() {
        return mysql + ":" + redis + ":" + mao;
    }
}
