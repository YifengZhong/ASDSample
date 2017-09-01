package com;

public class Main {

	public static void main(String[] args) {
		Customer  customerInvalid = new Customer("1","1",null,"1",null,true);
		Customer  customerDataWasher = new Customer("1","1",new Address(),"1","1",true);
		Customer  customerNoDataWasher = new Customer("2","2",new Address(),"2","2",false);
		
		AbstractFilter handler = ChainBuilder.getHandler();
		try {
			handler.handleRequest(customerInvalid);
			handler.handleRequest(customerDataWasher);
			handler.handleRequest(customerNoDataWasher);
		} catch (NoHandlerException e) {
			System.out.println("No handled Customer");
		}
	}

}
