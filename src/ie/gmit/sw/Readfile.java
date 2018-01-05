package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Readfile {
	
	/*
	 * Readfile Method takes in a file name
	 * reads the file line by line
	 * and passes it back to the the init() method 
	 * of the DocumentRunner class
	 */
	public static ArrayList<String> Readfile(String fileName) {
					// This will reference one line at a time
					ArrayList<String> doc = new ArrayList<String>();
					String line = null;
					String fileNamehere = fileName;
					try {
						// FileReader reads text files in the default encoding.
						FileReader fileReader = new FileReader(fileName);

						// Always wrap FileReader in BufferedReader.
						BufferedReader bufferedReader = new BufferedReader(fileReader);

						while ((line = bufferedReader.readLine()) != null) {
							doc.add(line);
						}
						// Always close files.
						bufferedReader.close();
					} catch (FileNotFoundException ex) {
						System.out.println("file not found '" + fileName + "'");
					} catch (IOException ex) {
						ex.printStackTrace();
					}
					return doc;
	}
}
