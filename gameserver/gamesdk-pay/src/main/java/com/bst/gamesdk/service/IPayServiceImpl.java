package com.bst.gamesdk.service;

import org.springframework.stereotype.Service;

@Service
public class IPayServiceImpl implements IPayService {
    public String pay(String name) {
        return "Hello, "+name+", you will pay $10.";
    }
}
