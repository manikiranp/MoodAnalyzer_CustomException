package com.moodanalyzer.main;

public class MoodAnalyzer {


	public String Analyzemood(String mood) throws MoodAnalyzerException {
		try {
		if (mood.toLowerCase().contains("sad"))
			return "sad";
		else
			return "happy";
		}catch (NullPointerException e) {
			throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTEREDNULL, "Please Enter proper message");
		}
	}
}

