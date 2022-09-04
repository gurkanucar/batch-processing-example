package com.gucardev.batchprocessingexample.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "`user`")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID uuid;

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
    private Integer age;


}
