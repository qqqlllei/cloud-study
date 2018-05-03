package com.qqlei.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * Created by 李雷 on 2018/5/3.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipKinApplication {


    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class,args);
    }
}
