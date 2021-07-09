package com.higlowx.scal.ebpp.service.bill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Dylan.Li
 * @date 2021/7/7
 * @since
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.higlowx.scal.ebpp.service.bill.mybatis.mapper")
public class AppStart {

    public static void main(String[] args) {
        SpringApplication.run(AppStart.class, args);
    }
}
