package com.moodanalyzer.main;

public class MoodAnalyzer {


	public String Analyzemood(String mood) {
		if (mood.toLowerCase().contains("sad"))
			return "sad";
		else
			return "happy";
	}
}
