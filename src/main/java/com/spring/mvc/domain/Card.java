package com.spring.mvc.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class Card {

    private String no;

    @DateTimeFormat(pattern = "yyMMdd")
    private String validMonth;

    @Override
    public String toString() {
        return "Card{" +
                "no='" + no + '\'' +
                ", validMonth='" + validMonth + '\'' +
                '}';
    }
}
