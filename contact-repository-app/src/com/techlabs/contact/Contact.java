package com.techlabs.contact;

import java.io.Serializable;

public class Contact implements Serializable {
	private int id;
	private String firstName;
	private String lastName;
	private String location;
	private long phoneNumber;
	private String emailId;

	public Contact(int id, String firtName, String lastName, String location,
			long phoneNumber, String emailID) {
		this.id = id;
		this.firstName = firtName;
		this.lastName = lastName;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.emailId = emailID;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", location=" + location + ", phoneNumber="
				+ phoneNumber + ", emailId=" + emailId + "\n";
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
