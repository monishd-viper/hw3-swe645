package com.example.StudentSurveyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.StudentSurveyApp.repository")
@EntityScan(basePackages="com.example.StudentSurveyApp.model")
public class StudentSurveyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentSurveyAppApplication.class, args);
	}

}