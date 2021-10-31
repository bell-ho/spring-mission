package com.spring.test01.controller;

import org.springframework.stereotype.Controller;

@Controller
public class LogoutController {

    public String logout() {
        return "/test01/auth/login";
    }
}
