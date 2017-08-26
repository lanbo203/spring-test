package com.huntkey.dev.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableFeignClients
public class DemoClientApplication {


	@Value("${server.port}")
	private String port;

	@RequestMapping("/hi")
	public String home(@RequestParam String name){
		return "hi "+name+",i am from port:" +port;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoClientApplication.class, args);
	}
}
