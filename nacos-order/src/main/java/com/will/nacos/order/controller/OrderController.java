package com.will.nacos.order.controller;

import com.will.nacos.order.service.feign.StockFeignService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author maolingwei
 * @Date 2022-02-22 10:58 PM
 * @Version 1.0
 **/
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private StockFeignService stockFeignService;

    @GetMapping("test")
    public String test() {
        return stockFeignService.test("牛逼");
    }

//    @Autowired
//    private RestTemplate restTemplate;
//
//    @GetMapping("test")
//    public String test(String msg) {
//        return restTemplate.getForObject("http://nacos-stock-server/stock/test?info=" + msg, String.class);
//    }
}
