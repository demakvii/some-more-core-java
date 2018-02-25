package com.techlabs.custom.generic.test;

import com.techlabs.custom.generic.Student;
import com.techlabs.custom.generic.TechLabQ;

public class TestStudent {

	public static void main(String[] args) {
		TechLabQ<Student> list = new TechLabQ<Student>();
		list.enqueue(new Student(1, "Mayur", "Panvel"));
		list.enqueue(new Student(2, "Vikram", "Andheri"));
		list.enqueue(new Student(3, "Akshay", "Dadar"));
		
		display(list);
		System.out.println("----");
		list.dequeue();
		display(list);
	}

	private static void display(TechLabQ<Student> list) {
		for (Student student : list) {
			System.out.println(student);
		}
	}

}
