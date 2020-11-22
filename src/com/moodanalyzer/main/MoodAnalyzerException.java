package com.moodanalyzer.main;

public class MoodAnalyzerException  extends Exception {
	
	enum ExceptionType{
		ENTEREDNULL,ENTERED_EMPTY
	}
	public ExceptionType type;
	
	public MoodAnalyzerException(ExceptionType type, String s) {
		super(s);
		this.type=type;
	}

	public ExceptionType getType() {
		return type;
	}

}
