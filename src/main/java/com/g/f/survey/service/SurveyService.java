package com.g.f.survey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.g.f.survey.repository.SurveyReposotory;
import com.g.f.survey.entity.Survey;;

@Service
@Transactional
public class SurveyService {

	@Autowired
	SurveyReposotory surveyReposotory;

	public List<Survey> findAll() {
		return surveyReposotory.findAll(new Sort(Sort.Direction.ASC, "surveyId"));
	}

	public Survey save(Survey survey) {
		return surveyReposotory.save(survey);
	}

	public void delete(int surveyId) {
		surveyReposotory.delete(surveyId);
	}

	public Survey find(int surveyId) {
		return surveyReposotory.findOne(surveyId);
	}
}
