package com.will.nacos.order.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description TODO
 * @Author maolingwei
 * @Date 2022-02-22 11:20 PM
 * @Version 1.0
 **/
@FeignClient("nacos-stock-server")
public interface StockFeignService {

    @RequestMapping("stock/test")
    String test(@RequestParam("info") String info);
}
