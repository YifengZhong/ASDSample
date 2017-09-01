package com;



public class Customer implements Person {
	public Customer(Image city) {
		locationMap = city;
	}
	private int customerId;
	private String firstName;
	private String lastName;
	private Address residenceAddress;
	private HealthProfile profile;
	//city map with a red dot representing residence location
	private Image locationMap;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getResidenceAddress() {
		return residenceAddress;
	}
	public void setResidenceAddress(Address residenceAddress) {
		this.residenceAddress = residenceAddress;
	}
	public HealthProfile getProfile() {
		return profile;
	}
	public void setProfile(HealthProfile profile) {
		this.profile = profile;
	}
	@Override
	public void print() {
		System.out.println("customerId: " + customerId + " firstName: " + firstName +
				" lastName: "+ lastName + " Location: "+ locationMap.getName() );
		
	}
	
}
