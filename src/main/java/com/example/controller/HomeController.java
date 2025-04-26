package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
public class HomeController {

    @GetMapping("/get")
    @ResponseBody
    public String home() {
        return "Hello from Correct Spring MVC Project!";
        
        
     
    }
}
