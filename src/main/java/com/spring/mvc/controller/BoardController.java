package com.spring.mvc.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping(value = "/{boardNo}" , headers = "Accept=application/json")
    public ResponseEntity test() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
