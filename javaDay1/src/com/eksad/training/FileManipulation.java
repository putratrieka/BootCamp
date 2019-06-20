package com.eksad.training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path file = Paths.get("D:/file.txt");

		try {
			List<String> lines = Files.readAllLines(file);
			for (String line : lines) {
				System.out.println(line);
			}
			
			Path output = Paths.get("D:/File/output.txt");
			List<String> writeLines = new ArrayList<String>();
			writeLines.add("this is a new file");
			writeLines.add("created using java");
			writeLines.add("Using java.nio");
			
			Files.write(output, writeLines);
		} catch (IOException e) {
			e.printStackTrace();			
			// TODO: handle exception
		}
		

		

	}

}
