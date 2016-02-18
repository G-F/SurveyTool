package com.g.f.survey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.g.f.survey.entity.Answer;
import com.g.f.survey.repository.AnswerRepository;

@Service
@Transactional
public class AnswerService {

	@Autowired
	AnswerRepository answerRepository;

	public Answer save(Answer answer) {
		return answerRepository.save(answer);
	}

}
