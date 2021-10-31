package com.spring.test01.controller;

import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

    public String loginForm() {
        return "/test01/auth/login";
    }

    public String login() {
        return "/test01/auth/loginSuccess";
    }
}
