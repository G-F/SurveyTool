package com.g.f.survey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;

import com.g.f.survey.entity.Survey;
import com.g.f.survey.service.SurveyService;

@RestController
@RequestMapping("api/surveys")
public class SurveyController {
	
	@Autowired
	SurveyService surveyService;
	
	@RequestMapping(method = RequestMethod.GET)
	List<Survey> getSurveys(){
		return surveyService.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	Survey insertSurvey(@Validated @RequestBody Survey survey) {
		return surveyService.save(survey);
	}

}
