package org.campus02.personmanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PersonenManager {
	private ArrayList<Person> Liste = new ArrayList<>();
	
	public void load(String path){
		BufferedReader br = null;
			try {				
				File f = new File(path);
				File f1 = new File("D://PersonenGeschrieben.txt");
				FileReader fl  = new FileReader(f);
				br = new BufferedReader(fl);
				FileWriter fw = new FileWriter(f1, false); //false wird �berschrieben, true wird angef�gt
				PrintWriter pw = new PrintWriter(fw);
			
				String line;
				while ((line = br.readLine()) != null){
			
					String[] parts = line.split(",");
					Person P = new Person(parts[0], parts[1], parts[2]);
					Liste.add(P);
					pw.println(parts[0]+"," + parts[1] + "," +parts[2]);
					
				}
				br.close(); //wird nach unten weitergegeben, close nur bei �u�ersdem n�tig
				pw.flush();
				pw.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			

	}
	//seperates Ausgeben der Personen
/*
	public void save(String path){
		try {
			File f = new File(path);
			FileWriter fw = new FileWriter(f, false); //false wird �berschrieben, true wird angef�gt
			PrintWriter pw = new PrintWriter(fw);
			
			for (Person person : Liste.getPerson) {
				pw.println(person.getVorname()+","+person.getNachname()+","+person.getOrt());
			}
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
*/
	public ArrayList<Person> getListe() {
		return Liste;
	}


}
