package com.springcloud.serviceribbon.helloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;


    public String hiService(String name) {
        System.out.println("I am Ribbon Service !");
        String s = restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
        return s;
    }
}
