package com.huntkey.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果
 * Feign 采用的是基于接口的注解
 * Feign 整合了ribbon
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
//@EnableHystrixDashboard
public class SericeFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SericeFeignApplication.class, args);
	}
}
