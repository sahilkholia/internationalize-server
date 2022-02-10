package com.server.internationalize;

import com.server.internationalize.controller.Controller;
import com.server.internationalize.entity.Survey;
import com.server.internationalize.repository.SurveyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternationalizeApplication {

	@Autowired
	SurveyRepo surveyRepo;

	public static void main(String[] args) {
		SpringApplication.run(InternationalizeApplication.class, args);
	}

}
