package com.springcloud.serviceribbonhystric.controller;

import com.springcloud.serviceribbonhystric.service.RibbonHystricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
;

@RestController
public class RibbonHystricController {

    @Autowired
    private RibbonHystricService ribbonHystricService;

    @GetMapping("/hi")
    public String getHi(@RequestParam String name){
        return ribbonHystricService.hiService(name);
    }
}
