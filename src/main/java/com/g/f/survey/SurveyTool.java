package com.g.f.survey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class SurveyTool {
	
	public static void main(String[] args) {
		SpringApplication.run(SurveyTool.class, args);
	}

}
