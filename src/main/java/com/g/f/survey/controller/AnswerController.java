package com.g.f.survey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.g.f.survey.entity.Answer;
import com.g.f.survey.service.AnswerService;

@RestController
@RequestMapping("api/v1/answers")
public class AnswerController {

	@Autowired
	AnswerService answerService;

	@RequestMapping(method = RequestMethod.POST)
	Answer insertAnswer(@Validated @RequestBody Answer answer) {

		return answerService.save(answer);

	}
	
	@RequestMapping(value="/{questionId}", method = RequestMethod.GET)
	List<Answer> getAnswersByQuestionID(@PathVariable int questionId) {
		return answerService.findByQuestionID(questionId);
	}

}
