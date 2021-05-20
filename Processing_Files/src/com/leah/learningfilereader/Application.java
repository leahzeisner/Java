package com.leah.learningfilereader;

import java.io.*;

public class Application {

	public static void main(String[] args) {
		
		File file = new File("myfile.txt");
		
		
		// TRY WITH RESOURCES
		// automatically closes FileReader and BufferedReader
		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {
				
			String line = bufferedReader.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: File Not Found");
			
		} catch (IOException e) {
			System.out.println("Error: Problem Reading the File: " + file.getName());
			
		}

	}

}
