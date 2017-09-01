package com;

public class Main {

	public static void main(String[] args) {
		TraceFactory tracef = TraceFactory.getInstance();
		Trace trace = tracef.createTrace(TraceTp.CONSOLE);
		trace.setDebug(true);
		trace.debug("you are welcome");
		
	}

}
