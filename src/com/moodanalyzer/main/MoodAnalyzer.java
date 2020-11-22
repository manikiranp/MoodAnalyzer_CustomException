package com.moodanalyzer.main;

public class MoodAnalyzer {
	
	private String message;
	
	public MoodAnalyzer(String message) {
		super();
		this.message = message;
	}

	
	public MoodAnalyzer() {
		
	}

	public String Analyzemood(String mood) {
		if (mood.toLowerCase().contains("sad"))
			return "sad";
		else
			return "happy";
	}
}
