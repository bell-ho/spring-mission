package com.spring.mvc.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Member24 {

    private String userId;
    private String password;

    @DateTimeFormat(pattern = "yyMMdd")
    private Date dateOfBirth;
}
