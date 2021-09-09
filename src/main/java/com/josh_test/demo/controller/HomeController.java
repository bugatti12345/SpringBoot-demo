package com.josh_test.demo.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.josh_test.demo.pojo.HomeResponse;
import jdk.jfr.internal.tool.Main;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String title() {
        return "This is home page";
    }

    // get variable from path variable
    @GetMapping(value = {"name/{username}"})
    public String username(
            @PathVariable String username
    ) {
        return String.format("Your name is %s!", username);
    }

    // get variable from params
    @GetMapping(value = {"age/{username}"})
    public HomeResponse response (
            @PathVariable String username,
            @RequestParam(value = "age", defaultValue = "1") String age
    ){
//        return String.format("Your name is %s!", username) + String.format("your age is %s!", age);
        return new HomeResponse(username, age);
    }
}


