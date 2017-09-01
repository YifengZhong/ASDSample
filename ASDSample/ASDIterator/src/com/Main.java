package com;

import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		Aggregate aggregate = new NameRepository();
		for(Iterator iterator = aggregate.getIterator();iterator.hasNext();){
			System.out.println(iterator.next());
		}
	}	
}
