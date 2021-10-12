package com.spring.mvc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private String userId;
    private String password;

    @DateTimeFormat(pattern = "yyMMdd")
    private Date dateOfBirth;

    @Override
    public String toString() {
        return "Member{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
