package com;

public abstract class AbstractFilter {
	private AbstractFilter next;
	
	public final AbstractFilter getNext() {
		return next;
	}
	public final void setNext(AbstractFilter next) {
		this.next = next;
	}
	public abstract void handleRequest(Customer customer) throws NoHandlerException;
	protected abstract boolean canHandle(Customer customer);
}
