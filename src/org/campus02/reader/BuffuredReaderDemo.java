package org.campus02.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffuredReaderDemo {

	public static void main(String[] args) {
		try {
			
			File f = new File("D:\\csv.csv");
			FileReader fl  = new FileReader(f);
			BufferedReader br = new BufferedReader(fl);
			
			String line;
			while ((line = br.readLine()) != null){
				
				/*
				 * alter Code
				String ausgabe="";
				for (int i = 0; i < line.length(); i++) {
					if(line.charAt(i)==';'){
						System.out.println(ausgabe);
						ausgabe="";
					}
					else{
						ausgabe +=line.charAt(i);
					}
				}
				
				*/
				
				String[] parts = line.split(";");
				for (int i = 0; i < parts.length; i++) { //hier auf die länge der teile zugreifen
					System.out.println(parts[i]);
				}
				
			}
			br.close(); //wird nach unten weitergegeben, close nur bei äußersdem nötig
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
