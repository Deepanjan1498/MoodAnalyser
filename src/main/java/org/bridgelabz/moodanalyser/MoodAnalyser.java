package org.bridgelabz.moodanalyser;

public class MoodAnalyser {
	String message;

	public MoodAnalyser(String message) {
		this.message = message;

	}

	public MoodAnalyser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String analyseMood() {

		if (message.contains(("Sad"))) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}

}
