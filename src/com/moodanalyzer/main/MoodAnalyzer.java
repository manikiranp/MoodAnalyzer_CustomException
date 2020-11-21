package com.moodanalyzer.main;

public class MoodAnalyzer {
	public String Analyzemood(String mood) {
		if(mood.contains("happy"))
		return "HAPPY";
		else
		return "SAD";
	}
}
