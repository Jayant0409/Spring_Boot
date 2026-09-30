package com.quiz.QuizService.entities;



public class Question {
	
	
	private Long questionId;
	private String question;
	private Long quizId; 

	
	
	public Long getQuizId() {
		return quizId;
	}

	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}

	public Question(Long questionId, String question) {
		super();
		this.questionId = questionId;
		this.question = question;
	}
	
	public Question() {
		super();
	
	}
	

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}
}

