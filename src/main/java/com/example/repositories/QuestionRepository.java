package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.entities.Question;

public interface QuestionRepository  extends JpaRepository<Question, Long>{

}
