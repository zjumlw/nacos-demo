package com.will.nacos.discovery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author maolingwei
 * @Date 2022-02-22 1:05 AM
 * @Version 1.0
 **/
@RestController
@RequestMapping("discovery")
public class NacosDiscoveryController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("get")
    public Object getService(String serviceName) {
        return discoveryClient.getInstances(serviceName);
    }
}
