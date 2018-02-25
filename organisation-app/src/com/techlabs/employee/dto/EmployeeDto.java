package com.techlabs.employee.dto;

public class EmployeeDto {
	private int id;
	private String fName;
	private String lName;
	private int managerId;

	public EmployeeDto(String fileName) {
		this.id = Integer.parseInt(fileName.split(",")[0]);
		this.fName = fileName.split(",")[1];
		this.lName = fileName.split(",")[2];

		this.managerId = Integer.parseInt(fileName.split(",")[3]);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

}
