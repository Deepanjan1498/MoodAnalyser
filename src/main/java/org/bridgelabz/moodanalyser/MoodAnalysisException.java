package org.bridgelabz.moodanalyser;

public class MoodAnalysisException extends Exception {

	enum ExceptionType {
		NULL_ENTERED, EMPTY_ENTERED;
	}

	ExceptionType type;

	public MoodAnalysisException(String message, ExceptionType type) {
		super(message);
		this.type = type;

	}

	class Exception extends Throwable {
	}

}
