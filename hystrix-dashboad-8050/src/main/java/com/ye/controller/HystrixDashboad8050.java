package com.ye.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
@EnableFeignClients("domain.impl")
@ComponentScan({"com.ye.controller","domain.fallback"})
@EnableHystrix
public class HystrixDashboad8050 {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboad8050.class, args);
	}

}
