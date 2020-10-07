package org.bridgelabz.moodanalyser;

import org.bridgelabz.moodanalyser.MoodAnalysisException.ExceptionType;

public class MoodAnalyser {
	String message;

	public MoodAnalyser(String message) {
		this.message = message;

	}

	public MoodAnalyser() {
		super();
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.contains(""))
				throw new MoodAnalysisException("Mood Entry is Empty.", ExceptionType.EMPTY_ENTERED);
			else if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";

		} catch (NullPointerException e) {
			throw new MoodAnalysisException("The mood provided is Null.", ExceptionType.NULL_ENTERED);
		}
	}

}
