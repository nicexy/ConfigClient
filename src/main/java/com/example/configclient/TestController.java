package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${msg}")
    private String msg;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return name+","+this.msg;
    }
}



