package com;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;

public class Employee implements Cloneable, Serializable {
	private int id;
	private String lastname;
	private String firstname;
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;
	private Employee supervisor;
	private Employee staff[];
	
	public Employee(int id, String lastname, String firstname, String streetAddress, String city, String state,
			String zipcode) {
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public Employee getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}
	public Employee[] getStaff() {
		return staff;
	}
	public void setStaff(Employee[] staff) {
		this.staff = staff;
	}
	@Override
	protected Object clone() {
		HashMap<Integer,Employee> ids = new HashMap<>();
		return doClone(this,ids);
	}
	private Employee doClone(Employee e, HashMap<Integer,Employee> ids) {
		if (ids.containsKey(e.getId())) {
			return ids.get(e.getId());
		}
		Employee newOne = new Employee(e.getId(), lastname, firstname, streetAddress, city, state,zipcode);
		ids.put(e.getId(),newOne);
		if (e.supervisor != null) {
			newOne.supervisor = doClone(e.supervisor,ids);
		}
		
		if(e.getStaff() != null) {
			newOne.staff = new Employee[e.getStaff().length];
			for(int i=0;i<e.getStaff().length;i++) {
				System.out.println("the chirldren of employee is: " + e.getId());
				newOne.staff[i] = doClone(e.getStaff()[i],ids);
			}
		}

		return newOne;
	}
	public int getId() {
		return id;
	}
	
}
