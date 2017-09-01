package mum.edu;

public class Adapter implements Target {
	
	private Adaptee adaptee = new Adaptee();
	@Override
	public void push(String str) {
		adaptee.add(str);
		
	}

	@Override
	public String pop() {
		int end = adaptee.getEnd();
		String str = adaptee.get(end);
		adaptee.remove(end);
		return str;
	}

	@Override
	public boolean isStackEmpty() {
		return adaptee.empty();
	}

	@Override
	public boolean isQuequeEmpty() {
		return adaptee.empty();
	}

	@Override
	public void add(String str) {
		push(str);
		
	}

	@Override
	public String poll() {
		String str = adaptee.get(0);
		adaptee.remove(0);
		return str;
	}

}
