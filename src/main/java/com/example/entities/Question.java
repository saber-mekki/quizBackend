package com.example.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Question {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String question;
    private String option_1;
    private String option_2;
    private String option_3;
    private String option_4;
    private int answer;
    
	
    public Question(long id,String question,String rep1,String rep2,String rep3,String rep4,int inswer) {
		this.id=id;
this.question=question;
this.option_1=rep1;
this.option_2=rep2;
this.option_3=rep3;
this.option_4=rep4;
this.answer=inswer;
	}

    public Question() {
		
	}
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption_1() {
		return option_1;
	}
	public void setOption_1(String option_1) {
		this.option_1 = option_1;
	}
	public String getOption_2() {
		return option_2;
	}
	public void setOption_2(String option_2) {
		this.option_2 = option_2;
	}
	public String getOption_3() {
		return option_3;
	}
	public void setOption_3(String option_3) {
		this.option_3 = option_3;
	}
	public String getOption_4() {
		return option_4;
	}
	public void setOption_4(String option_4) {
		this.option_4 = option_4;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}


}
