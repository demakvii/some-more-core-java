package com.techlabs.file;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] argsStrings) {

		try {
			FileWriter writer = new FileWriter("Welcome.txt");
			writer.write("Hello World\nHi world");
			writer.close();

		} catch (IOException ex) {

		}

	}

}
