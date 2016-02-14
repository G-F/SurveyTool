package com.g.f.survey.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {

	@Id
	@GeneratedValue
	private Integer questionId;

	@Column
	private String question;

	@Column(nullable = false)
	private Integer surveyId;

	@Column
	private Boolean freeDescriptionFlag;

	@Column
	private Integer upperLimitAnswers;

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	public Boolean getFreeDescriptionFlag() {
		return freeDescriptionFlag;
	}

	public void setFreeDescriptionFlag(Boolean freeDescriptionFlag) {
		this.freeDescriptionFlag = freeDescriptionFlag;
	}

	public Integer getUpperLimitAnswers() {
		return upperLimitAnswers;
	}

	public void setUpperLimitAnswers(Integer upperLimitAnswers) {
		this.upperLimitAnswers = upperLimitAnswers;
	}
}
