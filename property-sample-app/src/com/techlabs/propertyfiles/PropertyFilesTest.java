package com.techlabs.propertyfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFilesTest {

	public static void main(String[] argsStrings) {
		
		try {

			OutputStream outStream = new FileOutputStream("test.properties");

			Properties properties = new Properties();
			properties.setProperty("Name", "Mayur");
			properties.setProperty("Age", "21");

			properties.store(outStream, "This is a property files");
			
			outStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {

			InputStream inputStream = new FileInputStream("test.properties");

			Properties properties = new Properties();
			properties.load(inputStream);

			for (String property : properties.stringPropertyNames()) {

				String value = properties.getProperty(property);

				System.out.println(property + "=" + value);

			}
			inputStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
