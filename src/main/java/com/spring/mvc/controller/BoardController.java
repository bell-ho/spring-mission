package com.spring.mvc.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Log4j2
@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/list")
    public void list() {

    }

    @GetMapping("/get?register")
    public String registerForm() {
        System.out.println("gg");
        return "/board/register";
    }

    @PostMapping("/post?register")
    public String register() {
        return "/board/list";
    }

    @GetMapping("/get?modify")
    public String modifyForm() {
        return "/board/modify";
    }

    @PostMapping("/post?modify")
    public String modify() {
        return "/board/list";
    }

    @GetMapping("/get?remove")
    public String removeForm() {
        return "/board/remove";
    }

    @PostMapping("/post?remove")
    public String remove() {
        return "/board/list";
    }

    @GetMapping("/get?read")
    public String read(int boardNo) {
        return "/board/read";
    }
}
