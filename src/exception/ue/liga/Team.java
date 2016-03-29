package exception.ue.liga;

public class Team implements Comparable<Team> {
	
	private String Name;
	private int CountWon;
	private int CountDraw;
	private int CountLost;
	private int GoalsScored;
	private int GoalsGot;
	private int Points;
	private int PlayedRounds;
	
	public Team(String name) {
		super();
		Name = name;
		CountWon = 0;
		CountDraw = 0;
		CountLost = 0;
		GoalsScored = 0;
		GoalsGot = 0;
		Points = 0;
		PlayedRounds = 0;
	}
	
	@Override
	public int compareTo(Team o) {
		if (Points < o.Points)
		{
			return 1;
		}
		if (Points > o.Points)
		{
			return -1;
		}
		if ((GoalsScored-GoalsGot) < (o.GoalsScored-o.GoalsGot))
		{
			return 1;
		}
		if ((GoalsScored-GoalsGot) > (o.GoalsScored-o.GoalsGot))
		{
			return -1;
		}
		
		return 0;
	}
	
	public void gameFinished(int GoalsScored, int Goalsgot) throws GoalsMustBePositiveException{
		
		if (GoalsScored < 0 || Goalsgot <0){
			throw new GoalsMustBePositiveException();
		}
		
		this.GoalsScored+=GoalsScored;
		this.GoalsGot+=Goalsgot;
		this.PlayedRounds+=1;
		
		if(GoalsScored>Goalsgot){
			this.CountWon+=1;
			this.Points+=3;
		}
		if(GoalsScored==Goalsgot){
			this.CountDraw+=1;
			this.Points+=1;
		}
		if(GoalsScored<Goalsgot){
			this.CountLost+=1;
		}
		
	}

	public String getName() {
		return Name;
	}

	public int getCountWon() {
		return CountWon;
	}

	public int getCountDraw() {
		return CountDraw;
	}

	public int getCountLost() {
		return CountLost;
	}

	public int getGoalsScored() {
		return GoalsScored;
	}

	public int getGoalsGot() {
		return GoalsGot;
	}

	public int getPoints() {
		return Points;
	}

	public int getPlayedRounds() {
		return PlayedRounds;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setCountWon(int countWon) {
		CountWon = countWon;
	}

	public void setCountDraw(int countDraw) {
		CountDraw = countDraw;
	}

	public void setCountLost(int countLost) {
		CountLost = countLost;
	}

	public void setGoalsScored(int goalsScored) {
		GoalsScored = goalsScored;
	}

	public void setGoalsGot(int goalsGot) {
		GoalsGot = goalsGot;
	}

	public void setPoints(int points) {
		Points = points;
	}

	public void setPlayedRounds(int playedRounds) {
		PlayedRounds = playedRounds;
	}

	@Override
	public String toString() {
		return "Team [Name=" + Name + ", CountWon=" + CountWon + ", CountDraw=" + CountDraw + ", CountLost=" + CountLost
				+ ", GoalsScored=" + GoalsScored + ", GoalsGot=" + GoalsGot + ", Points=" + Points + ", PlayedRounds="
				+ PlayedRounds + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CountDraw;
		result = prime * result + CountLost;
		result = prime * result + CountWon;
		result = prime * result + GoalsGot;
		result = prime * result + GoalsScored;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + PlayedRounds;
		result = prime * result + Points;
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
		Team other = (Team) obj;
		if (CountDraw != other.CountDraw)
			return false;
		if (CountLost != other.CountLost)
			return false;
		if (CountWon != other.CountWon)
			return false;
		if (GoalsGot != other.GoalsGot)
			return false;
		if (GoalsScored != other.GoalsScored)
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (PlayedRounds != other.PlayedRounds)
			return false;
		if (Points != other.Points)
			return false;
		return true;
	}


	
	
	

}
