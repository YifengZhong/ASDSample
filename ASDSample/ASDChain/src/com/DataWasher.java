package com;

public class DataWasher extends AbstractFilter {

	@Override
	public void handleRequest(Customer customer) throws NoHandlerException {
		if (canHandle(customer)) {
			System.out.println("this is DataWasher request");
		} else {
			throw new NoHandlerException();
		}
	}

	@Override
	protected boolean canHandle(Customer customer) {
		return customer.isASalesLead();
	}

}
