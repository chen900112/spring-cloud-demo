package com.springclouddemo.order.controller;


import com.springclouddemo.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private StockFeignService stockFeignService;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() throws InterruptedException {
        String reduct = stockFeignService.reduct();
        return "order" + reduct;

    }
}
