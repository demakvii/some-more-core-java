package com.techlabs.employee.service;

import java.util.List;

import com.techlabs.employee.Employee;
import com.techlabs.employee.Organisation;
import com.techlabs.employee.datareader.IDataFile;
import com.techlabs.employee.dto.EmployeeDto;

public class EmployeeService {
	private Organisation organisation;

	private List<EmployeeDto> empDTOList;

	public EmployeeService(String filePath, IDataFile dataFile) {
		// TODO Auto-generated constructor stub

		empDTOList = dataFile.load(filePath);
		this.organisation = new Organisation(empDTOList);
	}

	public Employee getCEO() {
		return this.organisation.getCEO();
	}

	public List<Employee> getReportees(int id) {
		return this.organisation.getReportees(id);
	}

	public Employee getManager(int id) {
		return this.organisation.getManager(id);
	}
	
	public void printTreeHierarchy(){
		this.organisation.printTreeHierarchy();
	}
}