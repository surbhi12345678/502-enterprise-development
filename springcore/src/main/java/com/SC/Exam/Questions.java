package com.SC.Exam;

import java.util.List;

public class Questions {
	private String question;
	private List<String> options;
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	@Override
	public String toString() {
		return "Questions [question=" + question + ", options=" + options + "]";
	}
	
}
