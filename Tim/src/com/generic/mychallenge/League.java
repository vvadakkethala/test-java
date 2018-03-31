package com.generic.mychallenge;

import java.util.ArrayList;

public class League<T extends Team> implements Comparable<League<T>> {
	private String name;

	private ArrayList<T> teams = new ArrayList<>();

	public League(String name) {
		super();
		this.name = name;
	}

	public boolean addTeams(T Team) {
		if (teams.contains(Team)) {
			return false;
		} else {
			teams.add(Team);
			return true;
		}
	}
	
	public void printTeams() {
		
		for (int i=0; i<teams.size(); i++) {
			Team temp;
			boolean flag = true;
			while (flag) {
				if (teams.get(i).getRank() > teams.get(i+1).getRank()) {
					temp = teams.get(i);
//					teams.get(i) = teams.get(i+1);
//					teams.get(i+1) = teams.get(i);
					
				}
			}

			System.out.println("teams : " + (i+1) + " " + teams.get(i).getName());
		}
	}

	@Override
	public int compareTo(League<T> o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
