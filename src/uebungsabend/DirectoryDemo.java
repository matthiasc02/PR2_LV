package uebungsabend;

import java.io.File;

public class DirectoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\FireGapps");
		//file.isDirectory();
		
		System.out.println(file.listFiles().length);
		System.out.println(file.getName());
		System.out.println(file.length());
		
		System.out.println();
		
		
		print(file, "");
		System.out.println();
		System.out.println(getDirSize(file));
		
	}
	
	public static void print(File f, String prefix){
		File [] files = f.listFiles();
		
		System.out.println(prefix+"+ "+f.getName());
		
		for (File file : f.listFiles()) {
			if(file.isDirectory()){
			//	System.out.println(prefix+"+ "+f.getName());
				print(file, prefix + "  ");			
			}
			else{
				System.out.println(prefix+"  "+"- "+file.getName());
			}
		}
	
	}
	public static long getDirSize(File f){
		File [] files = f.listFiles();
		long size=0;
		if(!f.isDirectory()){
			size+=f.length();
		}
		else
		for (File file : f.listFiles()) {
			size+=getDirSize(file);
		}
		
		return size;
		
	}

}
