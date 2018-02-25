package com.techlabs.custom.generic;

public class Student {

	private int id;
	private String name;
	private String location;

	public Student(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", location="
				+ location + "]";
	}

}
