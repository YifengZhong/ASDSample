package com;

public class TraceFactory {
	enum Singleton {
		INSTANCE;
		
		private TraceFactory instance;
		private Singleton() {
			instance = new TraceFactory();
		}
		TraceFactory getInstance() {
			return instance;
		}
	}
	public static TraceFactory getInstance() {
		return Singleton.INSTANCE.getInstance();
	}
	public Trace createTrace(TraceTp tp) {
		Trace trace = null;
		if(tp == TraceTp.CONSOLE) {
			trace = new ConsoleTrace();
		} else if (tp == TraceTp.FILE) {
			trace = new FileTrace();
		}
		return trace;
	
	}
}
