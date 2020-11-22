package com.moodanalyzer.main;

	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;
	import org.junit.Assert;

	class MoodAnalyzerTest {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer();
	
		@Test
		void testAnalyzemood_whensad_returnsad() {
			Assert.assertEquals("sad",moodanalyzer.Analyzemood("I am in Sad Mood"));
		}
		
//		@Test
//		void analyzemood  
		
		@Test
		void testAnalyzemood_whennotsad_returnhappy() {
			Assert.assertEquals("happy",moodanalyzer.Analyzemood("I am in Any Mood"));
		}	


	}

