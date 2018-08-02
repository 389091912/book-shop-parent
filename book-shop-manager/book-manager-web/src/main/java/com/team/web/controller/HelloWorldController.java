package com.team.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloWorldController {
    @RequestMapping("/success")
    public String success(Map<String ,Object>map) {
        map.put("hello", "你好书亚");
        return "success";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello world quick！123";
    }



}
