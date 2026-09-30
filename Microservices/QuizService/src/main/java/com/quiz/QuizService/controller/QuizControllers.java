package com.quiz.QuizService.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizControllers {
	
	private QuizService quizService;

	public QuizControllers(QuizService quizService) {
		super();
		this.quizService = quizService;
	}
	
	// create  
	
	@PostMapping
	public Quiz create(@RequestBody	 Quiz quiz) { 
		return quizService.add(quiz);
		
	}
	
	// get all 
	
	@GetMapping
	public List<Quiz> get() {
		return quizService.get();
	}
	
	// get one 
	
	@GetMapping("/{id}")
	public Quiz getOne(@PathVariable Long id) {
		return quizService.get(id);
	}
	

}
