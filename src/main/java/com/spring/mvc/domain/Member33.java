package com.spring.mvc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Member33 {

    @NotBlank
    private String userId;
    private String password;

    @NotBlank
    @Size(max = 3)
    private String username;

    private String birthDay;

    @NotNull
    private String gender;

    public Member33() {
    }

    public Member33(String userId, String password, String username) {
        this.userId = userId;
        this.password = password;
        this.username = username;
    }
}
