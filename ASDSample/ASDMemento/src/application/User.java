package application;

import java.io.Serializable;

public class User  implements Serializable {
	private String id;
	private String lastName;
	private String firstName;
	private String address;
	public User(String id, String lastName, String firstName, String address) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getAddress() {
		return address;
	}
	
	
}
