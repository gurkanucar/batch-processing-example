package com.gucardev.batchprocessingexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BatchProcessingExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatchProcessingExampleApplication.class, args);
    }

}
