package org.campus02.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileCopyDemo {

	public static void main(String[] args) throws IOException{
		
		File in = new File("D:\\test1.txt");
		FileInputStream fileIn = new FileInputStream(in);
		
		File out = new File("D:\\test1copy.txt");
		FileOutputStream fileOut = new FileOutputStream(out);
		
		//URL url = new URL("http://www.campus02.at");
		//InputStream inputstream = url.openStream();
		
		int data = 0;
		
		while((data=fileIn.read()) != -1){
			fileOut.write(data);
		}
		
		fileIn.close();
		fileOut.close();

	}

}
