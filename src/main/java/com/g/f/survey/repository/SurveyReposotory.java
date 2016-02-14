package com.g.f.survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.g.f.survey.entity.Survey;

public interface SurveyReposotory extends JpaRepository<Survey, Integer> {

}
