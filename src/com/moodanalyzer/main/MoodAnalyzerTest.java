package com.moodanalyzer.main;

	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;
	import org.junit.Assert;

	public class MoodAnalyzerTest {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer();
	
		@Test
		public void testAnalyzemood_whensad_returnsad() {
			Assert.assertEquals("sad",moodanalyzer.Analyzemood("I am in Sad Mood"));
		}
		
		@Test
		void testAnalyzemood_whennotsad_returnhappy() {
			Assert.assertEquals("happy",moodanalyzer.Analyzemood("I am in Any Mood"));
		}
		
		@Test
		public void analyzemood_whennull_returnhappy() {
			Assert.assertEquals("happy",moodanalyzer.Analyzemood(null));
		}


	}

