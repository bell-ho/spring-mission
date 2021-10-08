package com.spring.mvc.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/list")
    public void list() {

    }

    @GetMapping("/register")
    public void registerForm() {

    }

    @GetMapping("/modify")
    public void modifyForm() {

    }

    @GetMapping("/read{no}")
    public String read(@PathVariable("no") int no) {
        log.info(no);
        return "read";
    }

    @GetMapping("/read2/{no}")
    public void read2(@PathVariable("no") int boardNo) {

    }
}
