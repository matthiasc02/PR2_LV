package exceptions.ue.transporter;

public class Transporter {
	
	public void beam(String person, String from, String to, boolean urgent) throws TransporterMalfunctionException{
			
		if (urgent==true && Math.random()<0.7){
			throw new TransporterMalfunctionException("Fehler beim Beamen, Objekt zerstört");
		}
		
		System.out.println("beaming "+person+" from "+from+" to "+to+" erfolgreich");

	}
	
	public void shutdown(){
		System.out.println("Transporter shutdown");
	}

	
}
