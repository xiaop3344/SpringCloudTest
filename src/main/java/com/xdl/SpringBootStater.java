package com.xdl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootStater {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStater.class,args);
    }
}
