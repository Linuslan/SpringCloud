package com.bst.gamesdk.gamesdkregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.bst.gamesdk")
@ComponentScan(basePackages = "com.bst.gamesdk")
@EnableDiscoveryClient
@RestController
@RefreshScope
public class GamesdkRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamesdkRegisterApplication.class, args);
    }

    @RequestMapping(value = "/hi2", method = RequestMethod.GET)
    public String hi() {
        return "hello, register";
    }
}
