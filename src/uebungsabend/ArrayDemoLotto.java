package uebungsabend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ArrayDemoLotto {

	public static void main(String[] args) {
		

		
		
		// TODO Auto-generated method stub
		int[][] array = {{5,18,31,34,42,45},
				{1,17,22,28,37,42},
				{2,8,13,16,25,39},
				{9,13,24,28,33,40},
				{10,13,26,28,36,44},
				{6,10,11,12,17,21},
				{14,31,34,36,41,42},
				{8,10,12,21,26,36},
				{3,5,23,28,30,45},
				{10,17,19,27,28,30},
				{2,15,19,23,31,42},
				{8,12,18,19,35,37},
				{5,9,14,26,36,38},
				{25,9,27,12,14,20},
				{2,13,16,17,20,22},
				{2,5,12,18,22,44},
				{4,5,8,18,26,42},
				{4,20,22,28,32,38},
				{6,13,16,31,43,44},
				{3,5,6,14,17,39},
				{2,7,10,33,35,38},
				{7,10,18,21,32,45},
				{3,4,11,27,28,45},
				{2,14,17,30,33,41},
				{4,14,18,20,28,33},
				{12,24,26,29,31,33},
				{7,10,16,21,23,28},
				{1,2,4,5,13,22},
				{17,26,29,30,43,44},
				{4,5,13,26,38,43},
				{3,6,7,9,20,37},
				{3,9,12,27,33,34},
				{6,13,29,34,35,40},
				{12,17,26,27,29,39}};
		
		System.out.println(array.length);
		System.out.println(array[0].length);
		
		System.out.println();
		int [] erg = findTop6Numbers(array);
		//Ergebnis ausgeben
		for (int i = 0; i < erg.length; i++) {
			System.out.print(erg[i]+"; ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println(getCountToNumber(array));
	}
	
	@Override
	public String toString() {
		return "ArrayDemoLotto []";
	}

	public static int[] findTop6Numbers(int[][] numbers){
		ArrayList<LottoZahlCount> list = new ArrayList<>();
		
		//Liste von Lottozahlen definieren
		//2-dim Array durchlaufen 
		//f�r jedes Element check ob schon in der Liste
		//wenn ja erh�hen, wenn nein hinzuf�gen
		
		
		for (int i = 0; i < numbers.length; i++) {
			
			for (int y= 0; y < numbers[i].length; y++) {
				//System.out.println(numbers[i][y]);
				
				boolean gefunden=false;
				for (LottoZahlCount lottoZahlCount : list) {
					if(lottoZahlCount.getZahl()==numbers[i][y]){
						lottoZahlCount.increment();
						gefunden=true;
					}
				}
				if(!gefunden){
					list.add(new LottoZahlCount(numbers[i][y]));
				}
			}
		}
		//System.out.println(list);
		Collections.sort(list);
		
		int [] top6 = new int[6];
		
		for (int i = 0; i < top6.length; i++) {
			top6[i]=list.get(i).getZahl();
			
		}
		return top6;
				
		
	}
	
	public static HashMap<Integer, Integer> getCountToNumber(int[][] numbers){
		HashMap<Integer, Integer> zahlen = new HashMap<>();
		for (int k = 1; k <= 45; k++) {
			zahlen.put(k, 0);			
		}
		//int temp=0;
		for (int i = 0; i < numbers.length; i++) 
		{
			for (int y = 0; y < numbers[i].length; y++) 
			{
				//temp = zahlen.get(numbers[i][y]);
				zahlen.put(numbers[i][y], zahlen.get(numbers[i][y]) +1);
			}
		}
		return zahlen;
		
	}
	
}