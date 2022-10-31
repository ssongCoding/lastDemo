package com.example.lastDemo.Member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    // 로그인
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // 회원가입
    @GetMapping("/join")
    public String join() {
        return "signup";
    }

    // 마이페이지
    @PostMapping("/mypage")
    public String mypage() {
        return "mypage";
    }
    
    // 웰컴페이지
    @PostMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}
