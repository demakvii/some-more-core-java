package com.techlabs.property;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileTest {

	public static void main(String[] argStrings) {

		try {
			InputStream inputStream = new FileInputStream("config.properties");
			Properties properties = new Properties();
			properties.load(inputStream);

			for (String property : properties.stringPropertyNames()) {

				String value = properties.getProperty(property);

				System.out.println(property + ": " + value);

			}
			
			inputStream.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
