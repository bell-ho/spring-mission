package com.spring.mvc.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Member3 {

    @NotEmpty(message = "필수값")
    private String userId;

    private String password;

    @NotBlank
    @Size(max = 3)
    private String userName;

    private String email;
    private String birthDay;

    @NotNull
    private String gender;
}
