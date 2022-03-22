package com.will.nacos.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author maolingwei
 * @Date 2022-02-22 10:54 PM
 * @Version 1.0
 **/
@RestController
@RequestMapping("stock")
public class StockController {

    @GetMapping("test")
    public String test(String info) {
        return "2 get info: " + info;
    }
}
