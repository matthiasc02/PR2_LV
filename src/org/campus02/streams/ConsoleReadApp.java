package org.campus02.streams;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;


public class ConsoleReadApp {

	public static void main(String[] args) throws IOException{
		
		File outFile = new File("D:\\eingabe.txt");
		FileOutputStream fileOut = new FileOutputStream(outFile);
		BufferedOutputStream buffered = new BufferedOutputStream(fileOut);
		
		int data = 0;
		//data=System.in.read() = Zuweisung auf data
		//und vergleich ob data != -1 --> Stream leer
		while((data=System.in.read()) != -1){
			if('x' == data){
				break;
			}					
			buffered.write(data);
			
			
		}
		//Auﬂerhalb der Schleife zumachen!!
		buffered.flush();
		buffered.close();

				
		//Reader in = new InputStreamReader(System.in); // textbasiertes lesen
		
		//char read = (char) in.read();
		//System.out.println(read);
		
		//BufferedReader consoleReader = new BufferedReader(in); //zeilenweises lesen
		//String line = consoleReader.readLine();
		//System.out.println(line);

	}

}
