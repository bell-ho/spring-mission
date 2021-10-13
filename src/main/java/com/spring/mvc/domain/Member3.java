package com.spring.mvc.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class Member3 {

    @NotBlank
    private String userId;

    private String password;

    @NotBlank
    @Size(max = 3)
    private String userName;

    private String email;
    private String birthDay;
    private String gender;
}
