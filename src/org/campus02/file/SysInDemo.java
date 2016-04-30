package org.campus02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class SysInDemo {

	public static void main(String[] args) {
		
		//BufferedReader br = null; // hier deklarieren, damit beim finally darauf zugegriffen werden kann
			
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) // kann gleich direkt zu beginn von try gemacht werden, nur bei implementiertne autoclose, dann kein finally n�tig
		{
			File file = new File ("D://selbsteingelesen.txt");
			//br = new BufferedReader(new InputStreamReader(System.in))		
			FileWriter fw = new FileWriter(file, true); // mit dem true wird alles was neu ist angeh�ngt
			PrintWriter pw = new PrintWriter(fw);
			
			String line;
			while (!(line = br.readLine()).equals("stop")){
				pw.println(line);
				//System.out.println(line);						
			}
			pw.close();
			
		} catch (FileNotFoundException ex) {
			//user aktion
			ex.printStackTrace();			
		} 
		catch(IOException ex){
			ex.printStackTrace();
		}
		/*
		finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
		*/
	}

}
