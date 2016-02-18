package com.g.f.survey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.g.f.survey.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
	
	public List<Question> findBySurveyId(Integer surveyId);

}
