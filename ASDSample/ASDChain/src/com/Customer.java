package com;

public class Customer {
	private String firstName;
	private String lastName;
	private Address address;
	private String phone;
	private String email;
	private boolean isASalesLead;
	
	public boolean isASalesLead() {
		return isASalesLead;
	}
	public Customer(String firstName, String lastName, Address address, String phone, String email, boolean isASalesLead) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.isASalesLead = isASalesLead;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Address getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
}
