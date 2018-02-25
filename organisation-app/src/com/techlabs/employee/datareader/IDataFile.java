package com.techlabs.employee.datareader;

import java.util.List;

import com.techlabs.employee.dto.EmployeeDto;

public interface IDataFile {

	public List<EmployeeDto> load(String filePath);

}
