package org.campus02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		File file = new File ("D://writerDemo.txt");
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		pw.println("Das ist die 1. Zeile Ä");
		pw.println("Ist das die 2. Zeile? ä Ja");
		
		pw.flush();
		pw.close();
		
		// Geschrieben Datei wieder auslesen und ausgeben
		String line;
		while ((line = br.readLine()) != null){
			System.out.println(line);
		}
		
		br.close();
		
	}

}
