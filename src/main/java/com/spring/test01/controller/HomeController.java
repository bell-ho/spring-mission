package com.spring.test01.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String home() {
        return "/test01/home";
    }
}
