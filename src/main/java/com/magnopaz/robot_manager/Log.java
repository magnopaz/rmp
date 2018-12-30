package com.magnopaz.robot_manager;

import java.text.DateFormat;

public class Log {
	
	DateFormat time;
	String message;
	
	public Log() {
	}
	
	public Log(DateFormat time, String message) {
		this.time = time;
		this.message= message;
	}
	
	public void logStep(String message) {
		throw new UnsupportedOperationException();
	}

}
