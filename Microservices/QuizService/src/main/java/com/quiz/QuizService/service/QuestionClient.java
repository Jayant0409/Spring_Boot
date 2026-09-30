package com.quiz.QuizService.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.QuizService.entities.Question;
import org.springframework.cloud.openfeign.FeignClient;



@FeignClient(url = "http://localhost:8082", value = "Question-Client")
public interface QuestionClient {
	
	
	@GetMapping("/question/quiz/{quizId}")
	List<Question>  getQuestionOfQuiz(@PathVariable("quizId") Long quizId);

}
 