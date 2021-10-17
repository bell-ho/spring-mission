package com.spring.mvc.domain;

import lombok.Data;

@Data
public class Member11 {

    private String userId;
    private String password;

    public Member11() {
    }

    public Member11(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }
}
