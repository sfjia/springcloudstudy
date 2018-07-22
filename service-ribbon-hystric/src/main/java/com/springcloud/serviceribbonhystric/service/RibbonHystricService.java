package com.springcloud.serviceribbonhystric.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonHystricService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        String s = restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
        return s;
    }

    public String hiError(String name){
        return "hi "+name+" , sorry Error";
    }
}
