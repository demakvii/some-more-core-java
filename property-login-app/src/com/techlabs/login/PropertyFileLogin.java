package com.techlabs.login;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class PropertyFileLogin {

	public static void main(String[] argStrings) {
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your name:");
		String name = scanner.next();

		System.out.println("Enter password:");
		String password = scanner.next();

		scanner.close();

		try {

			InputStream inputStream = new FileInputStream("user.properties");

			Properties properties = new Properties();
			properties.load(inputStream);

			for (int index = 1; index <= 5; index++) {
				String aName = properties.getProperty("name" + index);
				String aPassword = properties.getProperty("password" + index);

				if (aName.equals(name) && aPassword.equals(password)) {

					System.out.println("Login Successfully");
					flag = true;
					break;

				}
			}
			inputStream.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		if (flag == false)
			System.out.println("Login Failed");

	}

}
