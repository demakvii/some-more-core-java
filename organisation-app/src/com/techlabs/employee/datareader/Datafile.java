package com.techlabs.employee.datareader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.employee.dto.EmployeeDto;

public class Datafile implements IDataFile {

	@Override
	public List<EmployeeDto> load(String filePath) {
		String line = null;
		List<EmployeeDto> employee = new ArrayList<EmployeeDto>();
		try {
			FileReader fileReader = new FileReader(filePath);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				employee.add(new EmployeeDto(line));
			}

			fileReader.close();
			bufferedReader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employee;
	}

}
