package com.spring.mvc.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RequestMapping("/board")
@Controller
public class BoardController {

    @GetMapping(value = "/06/html06")
    public String getAjax() {
        return "/board/06/html06";
    }

    @PutMapping(value = "/06/{boardNo}", headers = "X-HTTP-Method-Override=PUT")
    public ResponseEntity putAjax(@PathVariable("boardNo") String boardNo) {
        log.info(boardNo);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping(value = "/07/html07")
    public String getAjax07() {
        return "/board/07/html07";
    }

    @PostMapping(value = "/07/{boardNo}")
    public ResponseEntity postAjax(@PathVariable("boardNo") String boardNo) {
        log.info("post : /07/{boardNo} "+boardNo);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping(value = "/07/{boardNo}" , produces ="application/json; charset=utf-8")
    @ResponseBody
    public ResponseEntity putAjax07(@PathVariable("boardNo") String boardNo) {
        log.info("put /07/{boardNo} json : "+boardNo);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping(value = "/07/{boardNo}" , produces = "application/xml; charset=utf-8")
    @ResponseBody
    public ResponseEntity putAjax07xml(@PathVariable("boardNo") String boardNo) {
        log.info("put /07/{boardNo} xml : "+boardNo);
        return new ResponseEntity(HttpStatus.OK);
    }
    // 07번 header Content-type 을 다르게 설정했는데 application/json; charset=utf-8 만 호출됨

    @GetMapping(value = "/08/html08")
    public String getAjax08() {
        return "/board/08/html08";
    }

    @GetMapping(value = "/08/{boardNo}" , produces = "application/json")
    public ResponseEntity getAjax08(@PathVariable("boardNo") String boardNo) {
        log.info("get /08/{boardNo}  : "+boardNo);
        return new ResponseEntity(HttpStatus.OK);
    }
}
