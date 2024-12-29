package com.Spring.SpringWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "Spring boot learning";
    }
    @RequestMapping("/about")
    public String about(){
        return "About spring";
    }
}
