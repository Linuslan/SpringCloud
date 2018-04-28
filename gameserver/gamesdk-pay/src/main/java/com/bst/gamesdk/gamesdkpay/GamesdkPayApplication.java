package com.bst.gamesdk.gamesdkpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.bst.gamesdk")
@ComponentScan(basePackages = "com.bst.gamesdk")
public class GamesdkPayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamesdkPayApplication.class, args);
    }
}
