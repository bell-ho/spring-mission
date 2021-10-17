package com.spring.mvc.controller;

import com.spring.mvc.domain.Member;
import com.spring.mvc.domain.Member11;
import com.spring.mvc.domain.Member22;
import com.spring.mvc.domain.Member3;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.*;

@Controller
@Log4j2
public class TestController {

    // 09
    @GetMapping("/test0101")
    public void test0101() {
        log.info("test0101");
    }

    @GetMapping("/sub/test0101")
    public void subtest0101() {
        log.info("/sub/test0101");
    }

    // 10
    @GetMapping("/test0201")
    public String test0201() {
        return "/test0201";
    }

    @GetMapping("/sub/test0204")
    public String test0204() {
        return "redirect:/sub/test0205";
    }

    @GetMapping("/sub/test0205")
    public String test0205() {
        return "/sub/test0205";
    }

    // 11
    @GetMapping(value = "/test0301", produces = MediaType.APPLICATION_JSON_VALUE) // json 으로 응답
    @ResponseBody
    public Member11 test0301() {
        return new Member11("test", "123456");
    }

    @GetMapping(value = "/test0302") // json 으로 응답
    @ResponseBody
    public Member11 test0302() {
        return new Member11("test", "123456");
    }

    // 12
    @GetMapping(value = "/test04", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Member11> test04() {
        List<Member11> list = new ArrayList<>();
        list.add(new Member11("test1", "1"));
        list.add(new Member11("test1", "1"));
        list.add(new Member11("test1", "1"));

        return list;
    }

    // 13
    @GetMapping(value = "/test05", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Member11> test05() {
        Map<String, Member11> memberMap = new HashMap<>();

        memberMap.put("key1", new Member11("test01", "1"));
        memberMap.put("key2", new Member11("test01", "1"));
        memberMap.put("key3", new Member11("test01", "1"));

        return memberMap;
    }

    // 14
    @GetMapping("/test06")
    @ResponseBody
    public ResponseEntity<Void> test06() {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    // 15
    @GetMapping("/test07")
    @ResponseBody
    public ResponseEntity<String> test07() {
        return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
    }

    // 16
    @GetMapping(value = "/test08", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Member11> test08() {
        return new ResponseEntity<Member11>(new Member11("test1", "1"), HttpStatus.OK);
    }

    // 17
    @GetMapping(value = "/test09", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<Member11>> test09() {

        List<Member11> list = new ArrayList<>();
        list.add(new Member11("test1", "1"));
        list.add(new Member11("test1", "1"));
        list.add(new Member11("test1", "1"));

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    // 18
    @GetMapping(value = "/test10", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Map<String, Member11>> test10() {

        Map<String, Member11> memberMap = new HashMap<>();

        memberMap.put("key1", new Member11("test01", "1"));
        memberMap.put("key2", new Member11("test01", "1"));
        memberMap.put("key3", new Member11("test01", "1"));

        return new ResponseEntity<>(memberMap, HttpStatus.OK);
    }

    // 19
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

    @GetMapping(value = "/test1102")
    @ResponseBody
    public ResponseEntity<byte[]> test1102() {
        try {
            BufferedImage originalImage = ImageIO.read(new File("C:/upload/test.zip"));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write(originalImage, "zip", byteArrayOutputStream);
            byteArrayOutputStream.flush();

            byte[] imageInByte = byteArrayOutputStream.toByteArray();

            byteArrayOutputStream.close();

            HttpHeaders httpHeaders = new HttpHeaders();

            httpHeaders.add("Content-Disposition", "attachment; filename={filename}");
            httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);

            return new ResponseEntity<>(imageInByte, HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("exception : ", e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    // 20
    @GetMapping("/20/registerForm")
    public String registerForm() {
        return "/20/registerForm";
    }

    @GetMapping("/20/register")
    public String register20(String userId, String password) {
        log.info(userId);
        log.info(password);
        return "success";
    }

    @PostMapping("/20/register01") // 02, 03 ,04 ,05
    public String register01(String userId) {
        log.info(userId);
        return "success";
    }

    // 21
    @GetMapping("/21/register/{userId}")
    public String registerUserId(@PathVariable("userId") String userId) {
        log.info("registerUserId : " + userId);
        return "success";
    }

    @GetMapping("/21/registerForm")
    public String register21() {
        return "/21/registerForm";
    }

    @GetMapping("/21/register/{userId}/{coin}")
    public String register21m2(@PathVariable("userId") String userId, @PathVariable("coin") String coin) {
        log.info("register21m2 : " + userId);
        log.info("register21m2 : " + coin);
        return "success";
    }

    @PostMapping("/21/register01")
    public String register21m3(String userId) {
        log.info("userId : " + userId);
        return "success";
    }

    @PostMapping("/21/register0201")
    public String register21m4(String username) {
        log.info("username : " + username); //화면에서 보낼때 username이 없어서 받는게 없음
        return "success";
    }

    @PostMapping("/21/register0202") // 21문제 메소드 6 ,7 같은문제
    public String register21m5(@PathVariable("userId") String username) { //path부분에 {userId} 가 없어서 바인딩 안됨
        log.info("username : " + username);
        return "success";
    }

    // 22
    @GetMapping("/22/register01")
    public String register22() {
        return "/22/registerForm";
    }

    @PostMapping("/22/register01")
    public String register22m1(Member22 m) {
        log.info("register22m1 : " + m);
        return "success";
    }

    @PostMapping("/22/register02")
    public String register22m2(Member22 m, int coin) {
        log.info("register22m2 : " + m);
        log.info("register22m2 coin : " + coin);
        // 파라미터 둘다 들어감
        return "success";
    }

    @PostMapping("/22/register03")
    public String register22m3(int uid, Member22 m) {
        log.info("register22m3 : " + m);
        log.info("register22m3 uid : " + uid);
        return "success";
    }

    // 23
    @GetMapping("/23/register")
    public String register23() {
        return "/23/registerForm";
    }

    @GetMapping("/23/register01")
    public String register23m1(String userId, Date dateOfBirth) {
        log.info("userId : " + userId);
        log.info("dataOfBirth : " + dateOfBirth);
        return "success";
    }
    /////////////////////////////////////////////////////////////// 여기까지

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
        Member22 m = new Member22();
        m.setUserId("test");
        m.setPassword("123");

        model.addAttribute("member", m);
        return "read02";
    }
}
