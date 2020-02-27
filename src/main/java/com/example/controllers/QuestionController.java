package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.Question;

import com.example.services.ServiceQuestion;

@RequestMapping("/questions")
public class QuestionController {
	
	@Autowired 
	private ServiceQuestion questionService;
	
	
    @GetMapping(value="")
    public List<Question> listUser(){
        return questionService.getQuestions();
    }

    
    
    
    
    @GetMapping(value = "/getone/{id}")
    public Question getone(@PathVariable(value = "id") int id) {
    	
    	return questionService.getQUestionById(id);
    	
    }


}
