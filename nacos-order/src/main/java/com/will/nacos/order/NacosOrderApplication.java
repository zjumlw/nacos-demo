package com.will.nacos.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description TODO
 * @Author maolingwei
 * @Date 2022-02-19 10:24 PM
 * @Version 1.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.will.nacos.order.service.feign")
public class NacosOrderApplication {

    public static void main(String[] args) {
        System.out.println("start order application...");
        SpringApplication.run(NacosOrderApplication.class, args);
    }
}
