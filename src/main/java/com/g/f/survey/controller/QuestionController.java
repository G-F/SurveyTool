package com.g.f.survey.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.g.f.survey.entity.Question;
import com.g.f.survey.service.QuestionService;

@RestController
@RequestMapping("api/questions")
public class QuestionController {

	@Autowired
	QuestionService questionService;

	private static final Logger logger = LoggerFactory.getLogger(QuestionController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	List<Question> getQuestions() {
		return questionService.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	Question insertQuestion(@Validated @RequestBody Question question) {
		
		logger.info("Start insertQuestion():" + question);
		
		// 自由筆記フラグの指定がない場合はfalseとして扱う
		if(question.getFreeDescriptionFlag() == null) {
			question.setFreeDescriptionFlag(false);
		}
		
		// 回答上限数の指定がない場合、1に設定する
		if(question.getUpperLimitAnswers() == null) {
			question.setUpperLimitAnswers(1);
		}
		
		return questionService.save(question);
	}
}
