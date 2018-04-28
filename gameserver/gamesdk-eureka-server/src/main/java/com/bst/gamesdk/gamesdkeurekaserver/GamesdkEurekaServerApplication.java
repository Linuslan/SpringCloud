package com.bst.gamesdk.gamesdkeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GamesdkEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamesdkEurekaServerApplication.class, args);
    }
}
