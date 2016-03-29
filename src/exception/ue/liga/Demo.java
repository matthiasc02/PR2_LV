package exception.ue.liga;

public class Demo {

	public static void main(String[] args) throws TeamNotFoundException, LigaException {
		// TODO Auto-generated method stub
		Liga Bundenliga = new Liga("ÖsterreicheLiga");
		
		try {
			Bundenliga.add("Rapid");
			Bundenliga.add("Austria");
		
		} catch (TeamAlreadyExistException e)
		{			
			e.printStackTrace();
		}
		

				
		System.out.println("Aktuelle Tabelle");
		System.out.println(Bundenliga.getTeamsByPoints());
		System.out.println("Sortiert nach Namen");
		System.out.println(Bundenliga.getAllTeams());
	

		Bundenliga.newGame("Rapid", 3, "Austria", 1);



		
		System.out.println("Aktuelle Tabelle nach dem 1. Spieltag");
		System.out.println(Bundenliga.getTeamsByPoints());
		
	}

}
