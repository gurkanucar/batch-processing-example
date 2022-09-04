package com.gucardev.batchprocessingexample.config;


import com.gucardev.batchprocessingexample.model.Gender;
import com.gucardev.batchprocessingexample.model.User;
import com.gucardev.batchprocessingexample.model.UserInput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

import java.util.UUID;

@Slf4j
public class UserProcessor implements ItemProcessor<UserInput, User> {


    @Override
    public User process(UserInput userInput) throws Exception {
        final var user = User.builder()
                .uuid(UUID.fromString(userInput.getUuid()))
                .name(userInput.getName())
                .surname(userInput.getSurname())
                .username(userInput.getUsername())
                .email(userInput.getEmail())
                .job(userInput.getJob())
                .country(userInput.getCountry())
                .city(userInput.getCity())
                .street(userInput.getStreet())
                .detailedAddress(userInput.getDetailedAddress())
                .time(userInput.getTime())
                .phone(userInput.getPhone())
                .lat(userInput.getLat())
                .lon(userInput.getLon())
                .language(userInput.getLanguage())
                .gender(userInput.getGender().equals("Male") ? Gender.MALE : Gender.FEMALE)
                .age(userInput.getAge())
                .build();

        return user;
    }
}
