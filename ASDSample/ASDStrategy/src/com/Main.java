package com;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Flight> flights = new ArrayList<>();
		flights.add(new Flight(100));
		flights.add(new Flight(200));
		flights.add(new Flight(300));
		
		Context context = new Context(new SinglePrice());
		System.out.println("the single Price is " + context.executeStrategy(flights));

		context = new Context(new TwoClasses());
		System.out.println("the Two Classes is " + context.executeStrategy(flights));

		context = new Context(new MultiClass());
		System.out.println("the Multi Price is " + context.executeStrategy(flights));
		
	}
}
