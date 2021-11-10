package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
                    Student james = new Student(
                            "Aminu",
                            "aminu.resa@gmail.com",
                            LocalDate.of(1997, Month.MARCH, 12));
                    Student mariam = new Student(
                            "Felix",
                            "felix.resa@gmail.com",
                            LocalDate.of(1990, Month.JANUARY, 5));

                    repository.saveAll(List.of(james, mariam));
        };
    }
}
