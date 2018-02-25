package com.techlabs.student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentUtils {
	List<Student> students;

	public StudentUtils(String csvFile) {
		String line = null;
		students = new ArrayList<Student>();
		try {
			FileReader fileReader = new FileReader(csvFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				students.add(new Student(line));
			}

			fileReader.close();
			bufferedReader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void sortByName() {
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student student0, Student student1) {
				return student0.getName().compareTo(student1.getName());
			}
		});
		System.out.println(students);
	}

	public void sortByLocation() {
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student student0, Student student1) {
				return student0.getLocation().compareTo(student1.getLocation());
			}
		});
		System.out.println(students);

	}
}
