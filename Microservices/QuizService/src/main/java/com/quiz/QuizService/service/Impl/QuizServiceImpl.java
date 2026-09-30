package com.quiz.QuizService.service.Impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.repositories.QuizRepository;
import com.quiz.QuizService.service.QuestionClient;
import com.quiz.QuizService.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService {
	
	private QuizRepository quizRepository;
	
	private QuestionClient questionClient;
	

	
	public QuizServiceImpl(QuizRepository quizRepository, QuestionClient questionClient) {
		super();
		this.quizRepository = quizRepository;
		this.questionClient = questionClient;
	}

	@Override
	public Quiz add(Quiz quiz) {
		return quizRepository.save(quiz);
	}	

	@Override
	public List<Quiz> get() {
		List<Quiz> quizzes = quizRepository.findAll();
		
		List<Quiz> newQuizList = quizzes.stream().map(quiz -> { 
			quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
			
		    return quiz;
		    
		}).collect(Collectors.toList());
		
		return newQuizList; 
	}

	@Override
	public Quiz get(Long id) {
		Quiz quiz = quizRepository.findById(id).orElseThrow(()-> new RuntimeException("Quiz Not Found"));
		quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
		return quiz;
		
	}

}
