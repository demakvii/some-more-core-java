package com.techlabs.employee;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.techlabs.employee.dto.EmployeeDto;

public class Organisation {
	private TreeMap<Integer, Employee> emplist = new TreeMap<Integer, Employee>();
	private Employee ceo;

	public Organisation(List<EmployeeDto> empDTOlist) {
		for (EmployeeDto employeeDTO : empDTOlist) {
			Employee employee = new Employee(employeeDTO.getId(),
					employeeDTO.getfName(), employeeDTO.getlName(),
					employeeDTO.getManagerId());

			emplist.put(employeeDTO.getId(), employee);
			if (employee.getManagerId() == 0)
				ceo = employee;
			for (Map.Entry<Integer, Employee> mapOne : emplist.entrySet()) {
				if (mapOne.getValue().getManagerId() == employee.getId()) {
					for (Map.Entry<Integer, Employee> mapTwo : emplist
							.entrySet()) {
						if (mapTwo.getValue().getId() == employee.getId()) {
							mapTwo.getValue().setReportees(mapOne.getValue());
						}
					}
				}
				if (mapOne.getValue().getId() == employee.getManagerId()) {
					mapOne.getValue().setReportees(employee);
				}
			}

		}
	}

	public Employee getCEO() {
		return ceo;
	}

	public Employee getEmployeeById(int id) {
		for (Map.Entry<Integer, Employee> mapOne : emplist.entrySet()) {
			if (mapOne.getValue().getId() == id)
				return mapOne.getValue();
		}
		return null;
	}

	public Employee getManager(int id) {

		if (emplist.containsKey(id)) {
			return emplist.get(emplist.get(id).getManagerId());
		}
		return null;
	}

	public List<Employee> getReportees(int id) {
		if (emplist.containsKey(id)) {
			return emplist.get(id).getReportees();
		}
		return null;
	}

	public void printTreeHierarchy() {
		Employee employee = this.getCEO();
		employee.display();
	}
}
