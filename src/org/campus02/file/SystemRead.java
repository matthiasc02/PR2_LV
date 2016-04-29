package org.campus02.file;

import java.io.IOException;

public class SystemRead {

	public static void main(String[] args) throws IOException {
	    int byteRead;
	    
		while ((byteRead = System.in.read())!= -1){
			char[] ch = Character.toChars(byteRead);
			//System.out.print(ch[0]);
			if(ch[0] == 'x')
				break;
						
		}
		
		System.in.close();

	}

}
