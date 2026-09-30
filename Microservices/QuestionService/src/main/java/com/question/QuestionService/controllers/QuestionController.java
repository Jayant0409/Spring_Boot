package com.question.QuestionService.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.QuestionService.entities.Question;
import com.question.QuestionService.services.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	
	private QuestionService questionService;

	public QuestionController(QuestionService questionService) {
		super();
		this.questionService = questionService;
	}
	
	// create
	
	@PostMapping
	public Question create(@RequestBody Question ques) {
		return questionService.create(ques);
	}
	
	// getall
	
	@GetMapping
	public List<Question> get() {
		return questionService.get();
		
	}
	
	// get one
    
	@GetMapping("/{id}")
	public Question getOne(@PathVariable Long id) {
		return questionService.getOne(id);
	}
	
	//  GEt Questions of the specific quiz
	
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionOfQuiz(@PathVariable("quizId") Long quizId){
		return  questionService.getQuestionsOfQuiz(quizId);
	}
}
