package com.springcloud.eruekaclient;

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
public class EruekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EruekaClientApplication.class, args);
	}

	@Value("${server.port}")
	String port;

    @RequestMapping("/hi")
	public String home(@RequestParam(value="name",defaultValue = "eurekaClient")String name){
		return "hi ,"+ name +" I am from port " + port;
	}
}
