package org.campus02.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TCConfigUpload {
	
	public static void main(String[] args) throws IOException{
		
		//URL url = new URL("http://www.campus02.at");
		//InputStream inputStream = url.openStream();
		
		InputStream inputStream = new FileInputStream("C:\\users\\mseidl\\Desktop\\user.ini");
		Reader inputStreamReader = new InputStreamReader(inputStream);
		OutputStream outputStream = new FileOutputStream("ftp://upccsr:rM_d83*xxQ@169.254.1.1/verzeichnis/user.ini");
		Writer outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
		
		int data = 0;
		
		while((data=inputStreamReader.read()) != -1){
			outputStreamWriter.write(data);
		}
				
		outputStreamWriter.close();
		inputStreamReader.close();

	}

}
