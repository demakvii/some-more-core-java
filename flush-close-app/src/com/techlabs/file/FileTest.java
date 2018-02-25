package com.techlabs.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTest {

	public static void main(String[] args) {

		try {
			File myFile = new File(
					"E:/workspacePracs/write-file-app/Welcome.txt");
			FileWriter fileWriter = new FileWriter(myFile);
			BufferedWriter writer = new BufferedWriter(fileWriter);

			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(fileReader);

			writer.write("Hello world\n");
			writer.flush();

			writer.write("Welcome to java\n");

			System.out.println("Initailly file Content:");
			readFile(reader);

			writer.flush();

			writer.write("It's awesome");

			System.out.println("File Content after 1st flush:");
			readFile(reader);

			writer.flush();

			System.out.println("File Content after 2st flush:");
			readFile(reader);

			writer.close();

			reader.close();

			readFile(reader);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static void readFile(BufferedReader bufferedReader) {
		String line = null;
		try {
			while ((line = bufferedReader.readLine()) != null)
				System.out.println(line);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
