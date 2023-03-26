package com.springclouddemo.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping(value = "/reduct", method = RequestMethod.GET)
    public String reduct() {
        return "减少库存1";

    }
}
