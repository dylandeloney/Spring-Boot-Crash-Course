package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.FEBRUARY;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
          Student Maria =  new Student(
                    "Maria",
                    "maria@email.com",
                    LocalDate.of(2000, JANUARY, 5)


            );
            Student Bob =  new Student(
                    "Bob",
                    "Bob@email.com",
                    LocalDate.of(1998, FEBRUARY, 6)


            );
            repository.saveAll(
                    List.of(Maria, Bob)
            );
        };
    }
}
