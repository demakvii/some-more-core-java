package com.techlabs.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] argStrings) {
		String line = null;
		
		try {
			File file = new File("E:/workspacePracs/write-file-app/Welcome.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			
			while ((line = reader.readLine()) != null)
				System.out.println(line);
			
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
