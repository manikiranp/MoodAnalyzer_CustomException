package com.moodanalyzer.main;

public class MoodAnalyzer {


	public String Analyzemood(String mood) {
		try {
		if (mood.toLowerCase().contains("sad"))
			return "sad";
		else
			return "happy";
		}catch (NullPointerException e) {
			return "happy";
		}
	}
}

