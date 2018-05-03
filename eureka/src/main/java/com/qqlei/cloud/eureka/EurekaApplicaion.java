package com.qqlei.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by lilei on 2018/4/30.
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicaion {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicaion.class,args);
    }
}
