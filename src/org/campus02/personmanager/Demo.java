package org.campus02.personmanager;

public class Demo {

	public static void main(String[] args) {
		PersonenManager PM = new PersonenManager();
		
		PM.load("D://Personen.txt");
		
		System.out.println(PM.getListe()); // entweder Public liste PM.Liste oder getter

	}

}
