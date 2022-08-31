package com.gucardev.batchprocessingexample.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

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
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private int age;


}
