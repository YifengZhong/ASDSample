package com;

public class ValidatorFilter extends AbstractFilter {

	@Override
	public void handleRequest(Customer customer) throws NoHandlerException {
		if (!canHandle(customer)) {
			System.out.println("this is inValid request");
		} else {
			this.getNext().handleRequest(customer);
		}
		
	}

	@Override
	public boolean canHandle(Customer customer) {
		if ((customer.getAddress() == null) ||
			(customer.getPhone() == null) ||
			(customer.getEmail() == null) ||
			(customer.getFirstName() == null) ||
			(customer.getLastName() == null)){
			return false;
		}
		
		return true ;
	}

	
}
