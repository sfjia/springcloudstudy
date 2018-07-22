package com.springcloud.servicefeign.controller;

import com.springcloud.servicefeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name){
        System.out.println("I am Feign Controller !");
        return feignService.hi(name);
    }
}
