package com.exercise25streams.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StreamsApp {

	public static void main(String[] args) {
		// Object construction
		// File("\path\filename")
		File myFile = null;
		FileReader myReader = null;
		BufferedReader myBuffer = null;
		String line = "";
		
		/*
		 *  because JAVA doesn't know if the source is available you initialize 
		 *  'myReader' as a null and insert the object 'myReader' into a TRY-CATCH
		 */	
		try {
			myFile= new File("f:\\a\\a.txt");
			myReader = new FileReader(myFile);
			myBuffer = new BufferedReader(myReader);
			while((line = myBuffer.readLine()) != null) {
				line = line.toUpperCase();
				line = line.replace("O", "W");
				System.out.println(line);
			}
			//line = myBuffer.readLine();
			//System.out.println(line);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				myBuffer.close();
				myReader = null;
				myFile = null;				
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}

}
