package com;

public class Profiling extends ComponentDecorate {
	
	
	public Profiling(Component<String> component) {
		super(component);
	}
	@Override
	public boolean add(String e) {
		long result = System.currentTimeMillis();
		super.add(e);
		result = System.currentTimeMillis() - result;
		System.out.println("The add operation cost: " + result);
		return true;
	}
	@Override
	public boolean remove(String e) {
		long result = System.currentTimeMillis();
		super.remove(e);
		result = System.currentTimeMillis() - result;
		System.out.println("The remove operation cost: " + result);
		return true;
	}
	@Override
	public boolean size(String e) {
		long result = System.currentTimeMillis();
		super.size(e);
		result = System.currentTimeMillis() - result;
		System.out.println("The size operation cost: " + result);
		return true;
	}
	@Override
	public boolean contains(String e) {
		long result = System.currentTimeMillis();
		super.contains(e);
		result = System.currentTimeMillis() - result;
		System.out.println("The contains operation cost: " + result);
		return true;
	}
	
}
