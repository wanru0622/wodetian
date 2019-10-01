package com.ye.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class Zuul8600 {

	public static void main(String[] args) {
		SpringApplication.run(Zuul8600.class, args);
	}



}
