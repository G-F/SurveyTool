package com.g.f.survey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.g.f.survey.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

	public List<Answer> findByQuestionId(Integer questionId);

}
