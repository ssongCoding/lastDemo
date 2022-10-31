package com.example.lastDemo.Member;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Member 객체 : Entity & DTO 같이 하고 있어요.
 * 회원의 정보 : id, name, pw
 */
//@AllArgsConstructor
//@Getter
public class Member {
    //@Id : 기본키(PK) 설정
    String id;
    String name;
    String pw;

    public Member(String id, String name, String pw) {
        this.id = id;
        this.name = name;
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPw() {
        return pw;
    }
}
