package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Question;
import com.example.repositories.QuestionRepository;

@Service("questionService")
public class ServiceQuestionIMP implements ServiceQuestion {

	
	
	@Autowired
	private QuestionRepository questRepository;
	
	@Override
	public void getQuestion(Question qus) {
		
		questRepository.save(qus);
	}

	@Override
	public List<Question> getQuestions() {
		List<Question> list =new ArrayList<Question>();
		questRepository.findAll();
	
		return list;
	}

	@Override
	public Question getQUestionById(long id) {
		
		return questRepository.findById(id).get();
	}
	

}
