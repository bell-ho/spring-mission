package com.spring.mvc.controller;

import com.spring.mvc.domain.Member;
import com.spring.mvc.domain.Member2;
import com.spring.mvc.domain.Member3;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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

//        return new Member("test", "123456", new Date());
        return null;
    }

    @GetMapping(value = "/test04", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Member> test04() {
        List<Member> list = new ArrayList<>();
//        list.add(new Member("test1", "1", 5));
//        list.add(new Member("test1", "1", 5));
//        list.add(new Member("test1", "1", 5));
//        list.add(new Member("test1", "1", 5));

        return list;
    }

    @GetMapping(value = "/test05", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Member> test05() {
        Map<String, Member> memberMap = new HashMap<>();

//        memberMap.put("key1", new Member("test01", "1", 5));
//        memberMap.put("key1", new Member("test01", "1", 5));
//        memberMap.put("key1", new Member("test01", "1", 5));

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

//        Member m = new Member("test1", "1", new Date());
//        return new ResponseEntity<Member>(m, HttpStatus.OK);
        return null;
    }

    @GetMapping(value = "/test09", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<Member>> test09() {

        List<Member> list = new ArrayList<>();
//        list.add(new Member("test1", "1", 5));
//        list.add(new Member("test1", "1", 5));
//        list.add(new Member("test1", "1", 5));
//        list.add(new Member("test1", "1", 5));

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(value = "/test10", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Map<String, Member>> test10() {

        Map<String, Member> memberMap = new HashMap<>();

//        memberMap.put("key1", new Member("test01", "1", 5));
//        memberMap.put("key1", new Member("test01", "1", 5));
//        memberMap.put("key1", new Member("test01", "1", 5));

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

    @PostMapping("/userInsert")
    public String userInsert(Member3 member3, Model model) {
        log.info(member3.toString());
        model.addAttribute("member", member3);
        return "success";
    }

    @GetMapping("/registerForm01")
    public String registerForm01(Model model) {
        model.addAttribute("member", new Member3());
        return "registerForm";
    }

    @GetMapping("/register")
    public String register(
            @ModelAttribute("userId") String userId
            , @ModelAttribute("password") String password
            , @ModelAttribute("userName") String userName
            , @ModelAttribute("email") String email
            , Model model) {

        log.info(userId + " :" + password);
        model.addAttribute("userId", "test");
        model.addAttribute("password", "");
        model.addAttribute("userName", "userName");
        model.addAttribute("email", "email");
        return "/result";
    }

    @PostMapping("/register")
    public String registerpost(@Validated Member3 m, Model model, BindingResult result) {
        log.info(m.toString());
        log.info(result);

        return "success";
    }

    @GetMapping("/result")
    public String result(Model model) {
        model.addAttribute("msg", "success");
        return "result";
    }

    @GetMapping("/register01")
    public String register01(String userId, Date dateOfBirth) {
        log.info("userId : " + userId);
        log.info("dataOfBirth : " + dateOfBirth);
        return "success";
    }

    @GetMapping("/register02")
    public String register02(Member member) {
        log.info(member.toString());
        return "success";
    }

    @PostMapping("/register03")
    public String register03(int uid, Member member) {
        log.info(member.toString());
        log.info(uid);
        return "success";
    }

    @PostMapping("/register04")
    public String register04(String userId, String password, int coin) {
        log.info(userId);
        log.info(password);
        log.info(coin);
        return "success";
    }

    @GetMapping("/registerAllForm")
    public String registerAllForm() {
        return "registerAllForm";
    }

    @PostMapping("/registerUser")
    public String registerUser(Member member) {
        log.info(member.toString());
        return "success";
    }

    @PostMapping("/registerFile01")
    public String registerFile01(MultipartFile picture) {
        log.info("oriName : " + picture.getOriginalFilename());
        return "success";
    }

    @PostMapping("/uploadAjax")
    public ResponseEntity<String> uploadAjax(MultipartFile picture) {
        log.info(picture.getOriginalFilename());
        return new ResponseEntity<String>("UploadOK : " + picture.getOriginalFilename(), HttpStatus.OK);
    }

    @GetMapping("/read01")
    public String read01(Model model) {
        model.addAttribute("userId", "test");
        model.addAttribute("password", "123");
        model.addAttribute("userName", "userName");
        model.addAttribute("email", "email");
        return "read01";
    }

    @GetMapping("/read02")
    public String read02(Model model) {
        Member2 m = new Member2();
        m.setUserId("test");
        m.setPassword("123");
        m.setUserName("abc");
        m.setEmail("aaaa");

        model.addAttribute("member", m);
        return "read02";
    }
}
