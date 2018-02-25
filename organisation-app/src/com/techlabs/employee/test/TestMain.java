package com.techlabs.employee.test;

import com.techlabs.employee.datareader.Datafile;
import com.techlabs.employee.service.EmployeeService;

public class TestMain {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService("data.txt",
				new Datafile());
		System.out.println("CEO:"+service.getCEO());
		System.out.println("\n------------------------------------------------------");
		System.out.println("Tree Heirarchy");
		System.out.println("------------------------------------------------------");
		service.printTreeHierarchy();
	}
}
