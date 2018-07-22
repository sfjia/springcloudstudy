package com.springcloud.servicefeignhystric.feignHytricService.impl;

import com.springcloud.servicefeignhystric.feignHytricService.FeignHystricService;
import org.springframework.stereotype.Component;

@Component
public class FeignHystricServiceImp implements FeignHystricService {
    @Override
    public String sayHI(String name) {

        return "hi "+name+", This is an Error !";
    }
}
