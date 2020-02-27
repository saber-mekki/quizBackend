package com.example.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Reponce {

	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id ;
	    private String username;
	  
	    private String testLevel;
	    @OneToMany(fetch = FetchType.EAGER)
	    private List<Question> questions;
	    
	   
	    
		public Reponce() {

			
			
		}
		
		
		
		
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getTestLevel() {
			return testLevel;
		}
		public void setTestLevel(String testLevel) {
			this.testLevel = testLevel;
		}
		public List<Question> getQuestions() {
			return questions;
		}
		public void setQuestions(List<Question> questions) {
			this.questions = questions;
		}

	
	   
}
