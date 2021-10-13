package com.spring.mvc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private String userId;
    private String password;
    private String email;
    private String gender;
    private String hobby;
    private String[] hobbyArray;
    private List<String> hobbyList;
    private boolean foreigner;
    private String developer;
    private String nationality;
    private Address address;
    private List<Card> cardList;
    private String cars;
    private String[] carArray;
    private List<String> carList;
    private String introduction;

    @Override
    public String toString() {
        return "Member{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", hobby='" + hobby + '\'' +
                ", hobbyArray=" + Arrays.toString(hobbyArray) +
                ", hobbyList=" + hobbyList +
                ", foreigner=" + foreigner +
                ", developer='" + developer + '\'' +
                ", nationality='" + nationality + '\'' +
                ", address=" + address +
                ", cardList=" + cardList +
                ", cars='" + cars + '\'' +
                ", carsArray=" + Arrays.toString(carArray) +
                ", carList=" + carList +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
