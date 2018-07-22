package com.springcloud.servicefeignhystric.feignHystricController;

import com.springcloud.servicefeignhystric.feignHytricService.FeignHystricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHystricController {

    @Autowired
    private FeignHystricService feignHystricService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name){
        String s = feignHystricService.sayHI(name);
        return s;
    }
}
