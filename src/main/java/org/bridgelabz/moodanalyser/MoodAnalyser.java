package org.bridgelabz.moodanalyser;

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
			if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("The mood provided is Empty.");
		}
	}

}
