package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    private String login;

    @GetMapping("/login")
    public String loginForm() {
        return "loginSuccess";
    }
}
