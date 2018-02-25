package com.techlabs.student;

public class Student {
	private int id;
	private String name;
	private String location;

	public Student(String csvText) {
		this.id = Integer.parseInt(csvText.split(",")[0]);
		this.name = csvText.split(",")[1];
		this.location = csvText.split(",")[2];

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
