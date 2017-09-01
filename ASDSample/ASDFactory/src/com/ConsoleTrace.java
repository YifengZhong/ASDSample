package com;

public class ConsoleTrace implements Trace {
	
	private boolean debug;

	@Override
	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	@Override
	public void debug(String message) {
		if (debug == true) {
			System.out.println(message);
		}
	}

	@Override
	public void error(String message) {
		if (debug == true) {
			System.out.println(message);
		}		
	}

}
