package com.moodanalyzer.main;

	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;
	import org.junit.Assert;

	public class MoodAnalyzerTest {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer();
	
		@Test
		public void testAnalyzemood_whensad_returnsad() {
			try {
				Assert.assertEquals("sad",moodanalyzer.Analyzemood("I am in Sad Mood"));
			} catch (MoodAnalyzerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@Test
		void testAnalyzemood_whennotsad_returnhappy() {
			try {
				Assert.assertEquals("happy",moodanalyzer.Analyzemood("I am in Any Mood"));
			} catch (MoodAnalyzerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@Test
		public void analyzemood_whennull_throwexception() {
			try {
				moodanalyzer.Analyzemood(null);
			} catch (MoodAnalyzerException e) {
				e.printStackTrace();
			}
		}


	}

