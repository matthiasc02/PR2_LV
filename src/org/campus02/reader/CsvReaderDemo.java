package org.campus02.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvReaderDemo {

	public static void main(String[] args) {
		try {
			
			File f = new File("D:\\test1copy.txt");
			FileReader fl  = new FileReader(f);
			BufferedReader br = new BufferedReader(fl);
			
			String line;
			while ((line = br.readLine()) != null){
				System.out.println(line);
			}
			br.close(); //wird nach unten weitergegeben, close nur bei äußersdem nötig
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
