package com.bst.gamesdk.controller;

import com.bst.gamesdk.service.IPayService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {
    @Autowired
    IPayService payService;
    @RequestMapping(value="/pay", method = RequestMethod.GET)
    public String pay(@RequestParam String name) {
        return payService.pay(name);
    }
}
