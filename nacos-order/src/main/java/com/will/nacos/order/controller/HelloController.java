package com.will.nacos.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author maolingwei
 * @Date 2022-02-19 10:32 PM
 * @Version 1.0
 **/
@RestController
@RequestMapping("hello")
public class HelloController {

    @Value("${spring.application.name}")
    private String serverName;

    @GetMapping("")
    public String serverName() {
        return "serverName: " + serverName;
    }
}
