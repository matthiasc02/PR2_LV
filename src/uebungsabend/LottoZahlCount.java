package uebungsabend;

public class LottoZahlCount implements Comparable<LottoZahlCount> {
	private int zahl;
	private int counter;
	
	public LottoZahlCount(int zahl) {
		super();
		this.zahl = zahl;
		this.counter = 1;
	}
	
	public int getZahl() {
		return zahl;
	}
	public int getCounter() {
		return counter;
	}
	public void increment() {
		this.counter++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + counter;
		result = prime * result + zahl;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LottoZahlCount other = (LottoZahlCount) obj;
		//counter rausgenommen
		
		if (zahl != other.zahl)
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "LottoZahlCount [zahl=" + zahl + ", counter=" + counter + "]";
	}

	public int compareTo(LottoZahlCount o) {
		// TODO Auto-generated method stub
		if (counter > o.counter){
			return -1;
		}
		if (counter < o.counter){
			return 1;
		}
		return 0;
	}

	
	
	

}
