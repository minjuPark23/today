package com.minj.today.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controller {

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/filter/test")
    public String filterTest(){
        return "filter Test";
    }


}
