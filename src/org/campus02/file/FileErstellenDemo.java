package org.campus02.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileErstellenDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("D:\\objekt.dat");
		String text = "Hello World";
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oss = new ObjectOutputStream(fos);
		oss.writeObject(text);
		oss.flush();
		oss.close();
		// File wieder einlesen und ausgeben
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(ois.readObject());
		ois.close();
		
	}


}