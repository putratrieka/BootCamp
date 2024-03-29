package com.eksad.training;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileMannipulation {
	public static void main(String[] args) {
		// Untuk mengambil data dari PC
		//get file ver.1 (old) 
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader("D:/file.txt");
			bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();// membaca baris dari file
			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();			
			}
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
//					
		}
		finally {
			try {
				System.out.println("closing reader");
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
				System.out.println("closing done");
				
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		
		//get file ver.2
		// 
		try {
			Path file = Paths.get("D:/file.txt");
			List<String> lines = Files.readAllLines(file); // untuk membaca isi file
			for (String line : lines) {
				System.out.println(line);
			}

			// Menulis File, menyimpan ke PC
			Path output = Paths.get("D:/FIle/keluar.txt");
			List<String> writeLines = new ArrayList<String>();
			writeLines.addAll(lines);
			writeLines.add("This is a New File");
			writeLines.add("Created Using JAVA");
			writeLines.add("Using java.nio");

			Files.write(output, writeLines);

		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
