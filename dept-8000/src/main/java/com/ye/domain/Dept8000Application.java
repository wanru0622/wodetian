package com.ye.domain;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.ye.dao")
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
@ComponentScan({"com.ye.controller","domain"})
@EnableFeignClients("domain")
public class Dept8000Application {
	public static void main(String[] args) {
		SpringApplication.run(Dept8000Application.class, args);
	}
}
