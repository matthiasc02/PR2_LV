package org.campus02.streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StreamApp {

	public static void main(String[] args) {

		File outFile = new File("D:\\text.txt");
		System.out.println("exists?  " + outFile.exists());
		System.out.println(outFile.getAbsolutePath());
		System.out.println(outFile.getName());
		System.out.println("canWrite?  " + outFile.canWrite());

		writer(outFile);

	}

	
	
	private static void writer(File outFile) {
		try {
			FileWriter writer = null;

			writer = new FileWriter(outFile);
			writer.write("Mimi spielt Ball und mag Äpfel");
			writer.flush();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//writer.close();	//prüfen was da los is
			System.out.println("bye");

		}
	}

}
