package exceptions.ue.transporter;

public class Starship {
	private String name;
	private Transporter transporter = new Transporter();
	
	
	public Starship(String name) {
		this.name = name;
	}


	public void beamUp(String person, String from){
		
		try {
			transporter.beam(person, from, name, true);
		} catch (TransporterMalfunctionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			transporter.shutdown();
		}
	}

}
