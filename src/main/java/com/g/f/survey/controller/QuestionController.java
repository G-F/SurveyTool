package com.g.f.survey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping(method = RequestMethod.GET)
	List<Question> getQuestions() {
		return questionService.findAll();
	}
	
	Question insertQuestion(@RequestBody Question question) {
		
		// 自由筆記フラグの指定がない場合はfalseとして扱う
		if(question.getFreeDescriptionFlag() == null) {
			System.out.println("自由記述フラグがnull");
			question.setFreeDescriptionFlag(false);
		}
		
		// 回答上限数の指定がない場合、1に設定する
		if(question.getUpperLimitAnswers() == null) {
			System.out.println("回答数上限がnull");
			question.setUpperLimitAnswers(1);
		}
		
		return questionService.save(question);
	}
}
