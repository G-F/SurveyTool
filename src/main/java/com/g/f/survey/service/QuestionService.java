package com.g.f.survey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.g.f.survey.entity.Question;
import com.g.f.survey.repository.QuestionRepository;

@Service
@Transactional
public class QuestionService {

	@Autowired
	QuestionRepository questionRepository;

	public List<Question> findAll() {
		return questionRepository.findAll();
	}
	
	public List<Question> findBySurveyId(int surveyId) {
		return questionRepository.findBySurveyId(surveyId);
	}

	public Question save(Question question) {
		return questionRepository.save(question);
	}

}
