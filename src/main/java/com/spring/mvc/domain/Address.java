package com.spring.mvc.domain;

import lombok.Data;

@Data
public class Address {

    private String postcode;
    private String location;

    @Override
    public String toString() {
        return "Address{" +
                "postcode='" + postcode + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
