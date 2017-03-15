package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lois on 14.03.17.
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHello() {
        return "index";
    }

}
