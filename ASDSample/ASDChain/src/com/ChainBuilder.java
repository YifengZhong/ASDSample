package com;

public class ChainBuilder {
	private static AbstractFilter handler;

	public static AbstractFilter getHandler() {
		if(handler == null) {
			handler = buildChain();
		}
		return handler;
	}
	private static AbstractFilter buildChain(){
		AbstractFilter junior = new ValidatorFilter();
		AbstractFilter senior = new DataWasher();

		junior.setNext(senior);
		return junior;
	}
}
