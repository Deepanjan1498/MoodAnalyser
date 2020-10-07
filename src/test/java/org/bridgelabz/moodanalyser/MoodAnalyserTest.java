package org.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = null;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("SAD", mood);
		} catch (MoodAnalysisException e) {
		}
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String mood = null;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalysisException e) {
		}
	}

	@Test
	public void givenNullMood_ShouldReturnMoodAnalysisException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
			Assert.assertEquals(MoodAnalysisException.ExceptionType.NULL_ENTERED, e.type);
		}
	}

	@Test
	public void givenEmptyMood_ShouldReturnMoodAnalysisException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("null");
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
			Assert.assertEquals(MoodAnalysisException.ExceptionType.EMPTY_ENTERED, e.type);
		}
	}

}
