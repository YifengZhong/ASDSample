package com;

import java.util.HashMap;

public class CustomerFactory {
	private static final HashMap<String, Customer> cityMap = new HashMap();
	public static Customer getCustomer(Image city) {
		Customer customer = cityMap.get(city.getName());
		if(customer == null) {
			customer = new Customer(city);
			cityMap.put(city.getName(), customer);
		}
		return customer;
	}
}
