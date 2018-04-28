package com.bst.gamesdk.gamesdklogin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
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
@MapperScan(basePackages = "com.bst.gamesdk")
public class GamesdkLoginApplication {
    private String msg;
    public static void main(String[] args) {
        SpringApplication.run(GamesdkLoginApplication.class, args);
    }
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
        return "login-hi222";
    }
}
