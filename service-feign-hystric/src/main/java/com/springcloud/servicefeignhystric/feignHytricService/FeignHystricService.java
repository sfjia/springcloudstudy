package com.springcloud.servicefeignhystric.feignHytricService;


import com.springcloud.servicefeignhystric.feignHytricService.impl.FeignHystricServiceImp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client",fallback = FeignHystricServiceImp.class)
public interface FeignHystricService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHI(String name);

}
