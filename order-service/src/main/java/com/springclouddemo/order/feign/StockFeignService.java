package com.springclouddemo.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="stock-service",path = "/stock")
public interface StockFeignService {

        @RequestMapping(value = "/reduct", method = RequestMethod.GET)
        public String reduct();
}
