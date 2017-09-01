package com;

public class FileTrace implements Trace {

	private boolean debug;
	@Override
	public void setDebug(boolean debug) {
		this.debug = debug;
		
	}

	@Override
	public void debug(String message) {
		System.out.println("This in FileTraceDebug");
	}

	@Override
	public void error(String message) {
		System.out.println("This in FileTraceError");
	}
	
}
