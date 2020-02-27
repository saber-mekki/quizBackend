package com.example.services;

import java.util.List;

import com.example.entities.Question;

public interface ServiceQuestion {
	public void getQuestion(Question qus);
	public List<Question> getQuestions();
	public Question getQUestionById(long id);

}
