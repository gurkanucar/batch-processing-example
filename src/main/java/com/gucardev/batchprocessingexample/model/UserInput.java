package com.gucardev.batchprocessingexample.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInput {
    private String uuid;
    private String name;
    private String surname;
    private String username;
    private String email;
    private String job;
    private String country;
    private String city;
    private String street;
    private String detailedAddress;
    private String time;
    private String phone;
    private String lat;
    private String lon;
    private String language;
    private String gender;
    private Integer age;
}
