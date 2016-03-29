package exception.ue.liga;

import java.util.ArrayList;
import java.util.Collections;

public class Liga{
	private String name;
	private ArrayList<Team> teams = new ArrayList();
	
	public Liga(String name) {
		this.name=name;
	}
	
	public void add(String name) throws TeamAlreadyExistException{
		/*
		//zum prüfen ob schon vorhanden
		for (Team team : teams) {
			if(team.getName().equals(name))
			{
				//Fehlerfall
				throw new TeamAlreadyExistException();
			}
		}
		*/
		//zum prüfen ob schon vorhanden v2
		if (this.teams.contains(new Team(name))){
			throw new TeamAlreadyExistException();
		}
		
		this.teams.add(new Team(name));
	}
	
	
	public ArrayList<Team> getTeamsByPoints()
	{
		Collections.sort(teams); //sortiert nach vorgabe der Compare to
		return teams;
	}
	
	public ArrayList<Team> getAllTeams(){
		//Collections.sort(teams, new AlphabeticComperator());
		teams.sort(new AlphabeticComperator());
		return teams;
	}
	
	public void newGame(String teamA, int goalsA, String teamB, int goalsB) throws TeamNotFoundException, LigaException{
		if (!this.teams.contains(new Team(teamA))||!this.teams.contains(new Team(teamB))){
			throw new TeamNotFoundException();
		}
		try {
			
		for (Team team : teams) {
			if (team.getName().equals(teamA)){
					
						team.gameFinished(goalsA, goalsB);

			}
		}
		
		for (Team team : teams) {
			if (team.getName().equals(teamB)){
					team.gameFinished(goalsB, goalsA);

			}
		}
		} catch (GoalsMustBePositiveException e) {
			throw new LigaException();
		}
		
	}

}
