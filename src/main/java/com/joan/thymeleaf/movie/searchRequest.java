package com.joan.thymeleaf.movie;

public class searchRequest {
	private String term;

	public searchRequest(String term) {
		super();
		this.term = term;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}
	
	
}
