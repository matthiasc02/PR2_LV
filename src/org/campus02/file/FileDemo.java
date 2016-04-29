package org.campus02.file;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir = new File("D:\\FireGapps");
				
		for (File file : dir.listFiles()) {
			System.out.println("Name: " + file.getName()+" - Size: " + file.length());
		}

	}

}