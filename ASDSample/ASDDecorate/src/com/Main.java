package com;

public class Main {
	public static void main(String[] args) {
		Component<String> component,componentSB;
		System.out.println("this is the ArrayList Test");
	    component = new ClassArrayList();
	    for(int i = 0 ;i<100000; i++) {
	    	component.add(String.valueOf(i));
	    }
	    
	    componentSB = new Profiling(component);
	    componentSB.add("ABC");
	    componentSB.add("ABCD");
	    componentSB.remove("ABCD");
	    componentSB.contains("5677");
	    componentSB.size("ABCD");
	    
		System.out.println("this is the LinkedList Test");
	    component = new ClassLinkedList();
	    component = new ClassArrayList();
	    for(int i = 0 ;i<100000; i++) {
	    	component.add(String.valueOf(i));
	    }	    
	    componentSB = new Profiling(component);
	    componentSB.add("ABC");
	    componentSB.add("ABCD");
	    componentSB.remove("ABCD");
	    componentSB.contains("5677");
	    componentSB.size("ABCD");
	}
}
