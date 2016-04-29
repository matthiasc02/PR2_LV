package org.campus02.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

public class CharsetExample {

	public static void main(String[] args) throws IOException{
		
		URL url = new URL("http://www.campus02.at");
		InputStream inputStream = url.openStream();
		
		//InputStream inputStream       = new FileInputStream("D:\\test1.txt");
		Reader      inputStreamReader = new InputStreamReader(inputStream);
		
		OutputStream outputStream       = new FileOutputStream("D:\\test1copy.txt");
		Writer       outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
		
		int data = 0;
		
		while((data=inputStreamReader.read()) != -1){
			outputStreamWriter.write(data);
		}
				
		outputStreamWriter.close();
		inputStreamReader.close();

	}

}
