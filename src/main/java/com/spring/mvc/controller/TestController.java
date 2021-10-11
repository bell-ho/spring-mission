package com.spring.mvc.controller;

import com.spring.mvc.domain.Member;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.*;

@Controller
@Log4j2
public class TestController {

    @GetMapping("/test0101")
    public void test0101() {
        log.info("test0101");
    }

    @GetMapping("/sub/test0101")
    public void subtest0101() {
        log.info("/sub/test0101");
    }

    @GetMapping("/test0201")
    public String test0201() {
        return "/test0201";
    }

    @GetMapping("/sub/test0205")
    public String test0205() {
        return "/sub/test0205";
    }

    @GetMapping("/sub/test0204")
    public String test0204() {
        return "redirect:/sub/test0205";
    }

    @GetMapping(value = "/test0301", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Member test0301() {

        return new Member("test", "123456");
    }

    @GetMapping(value = "/test04", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Member> test04() {
        List<Member> list = new ArrayList<>();
        list.add(new Member("test1", "1"));
        list.add(new Member("test2", "1"));
        list.add(new Member("test3", "1"));
        list.add(new Member("test4", "1"));

        return list;
    }

    @GetMapping(value = "/test05", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Member> test05() {
        Map<String, Member> memberMap = new HashMap<>();

        memberMap.put("key1", new Member("test01", "1"));
        memberMap.put("key2", new Member("test02", "1"));
        memberMap.put("key3", new Member("test03", "1"));

        return memberMap;
    }

    @GetMapping("/test06")
    @ResponseBody
    public ResponseEntity<Void> test06() {
        ResponseEntity<Void> result = new ResponseEntity<Void>(HttpStatus.OK);
        return result;
    }

    @GetMapping("/test07")
    @ResponseBody
    public ResponseEntity<String> test07() {
        return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
    }

    @GetMapping(value = "/test08", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Member> test08() {

        Member m = new Member("test1", "1");
        return new ResponseEntity<Member>(m, HttpStatus.OK);
    }

    @GetMapping(value = "/test09", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<Member>> test09() {

        List<Member> list = new ArrayList<>();
        list.add(new Member("test1", "1"));
        list.add(new Member("test2", "1"));
        list.add(new Member("test3", "1"));
        list.add(new Member("test4", "1"));

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(value = "/test10", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Map<String, Member>> test10() {

        Map<String, Member> memberMap = new HashMap<>();

        memberMap.put("key1", new Member("test01", "1"));
        memberMap.put("key2", new Member("test02", "1"));
        memberMap.put("key3", new Member("test03", "1"));

        return new ResponseEntity<>(memberMap, HttpStatus.OK);
    }

    @GetMapping(value = "/test1101")
    @ResponseBody
    public ResponseEntity<byte[]> test1101() {
        try {
            BufferedImage originalImage = ImageIO.read(new File("C:/upload/test.png"));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write(originalImage, "png", byteArrayOutputStream);
            byteArrayOutputStream.flush();

            byte[] imageInByte = byteArrayOutputStream.toByteArray();

            byteArrayOutputStream.close();

            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setContentType(MediaType.IMAGE_PNG);

            return new ResponseEntity<>(imageInByte, HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("exception : ", e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/registerForm")
    public String registerForm() {
        return "/registerForm";
    }

    @GetMapping("/register")
    public String register(String userId, String password) {
        log.info(userId + " :" + password);

        return "/success";
    }

    @GetMapping("/register/{userId}")
    public String register2(String userId) {
        log.info(userId);
        return "/success";
    }

    @PostMapping("/register01")
    public String register01(String userId) {
        log.info(userId);
        return "success";
    }
}
