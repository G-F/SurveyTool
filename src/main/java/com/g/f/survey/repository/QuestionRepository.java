package com.g.f.survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.g.f.survey.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
