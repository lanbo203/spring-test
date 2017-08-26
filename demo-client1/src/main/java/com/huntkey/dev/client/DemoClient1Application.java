package com.huntkey.dev.client;

import com.huntkey.dev.common.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class DemoClient1Application {

	//private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigApplicationContext.class);

	@Value("${server.port}")
	private String port;

	@Autowired
	UserService2 userService2;

	@RequestMapping("/hi")
	public String home(@RequestParam String name){
//		System.out.println(applicationContext.toString());
//		UserService userService = applicationContext.getBean(UserService.class);

//		return "hi "+name+",i am from port:" +port;
		return "hi "+name+",i am from port:" +port +"  say:"+userService2.say();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoClient1Application.class, args);
	}
}
