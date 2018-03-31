package com.generic.mychallenge;

public class Main {
	
	public static void main(String[] args) {
		CricketTeam india = new CricketTeam("india", 1);
		CricketTeam australia = new CricketTeam("Australia", 2);
		CricketTeam england = new CricketTeam("England", 3);
		
		TennisTeam usa = new TennisTeam("usa", 1);
		TennisTeam germany = new TennisTeam("germany", 2);
		TennisTeam switzerlan = new TennisTeam("switzerlan", 3);
		
		SoccerTeam polland = new SoccerTeam("polland", 3);
		SoccerTeam france = new SoccerTeam("france", 2);
		SoccerTeam brazil = new SoccerTeam("brazil", 1);
		
		League<CricketTeam> cricketLeague = new League<>("cricketLeague");
		cricketLeague.addTeams(england);
		cricketLeague.addTeams(australia);
		cricketLeague.addTeams(india);
		
		cricketLeague.printTeams();
		
		
	}

}
