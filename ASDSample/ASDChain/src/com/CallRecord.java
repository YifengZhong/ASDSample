package com;

public class CallRecord {
	private Customer customer;
	private Agent agent;
	private String requestInformation;
	private boolean isValid;
	private boolean isASalesLead;
	public Customer getCustomer() {
		return customer;
	}
	public Agent getAgent() {
		return agent;
	}
	public String getRequestInformation() {
		return requestInformation;
	}
	public boolean isValid() {
		return isValid;
	}
	public boolean isASalesLead() {
		return isASalesLead;
	}
	
}
