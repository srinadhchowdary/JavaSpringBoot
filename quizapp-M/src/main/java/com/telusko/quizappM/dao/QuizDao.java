package com.telusko.quizappM.dao;

import com.telusko.quizappM.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
