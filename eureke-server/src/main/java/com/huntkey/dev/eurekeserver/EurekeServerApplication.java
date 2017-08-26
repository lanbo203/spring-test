package com.huntkey.dev.eurekeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureke server 注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekeServerApplication.class, args);
	}
}
