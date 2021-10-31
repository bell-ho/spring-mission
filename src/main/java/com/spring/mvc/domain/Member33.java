package com.spring.mvc.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Member33 {

    @NotNull
    private String userId;

    private String password;

    @NotNull
    @Size(min = 3)
    private String username;

    private String birthDay;

    @NotNull
    private String gender;

}
