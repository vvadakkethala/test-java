package com.vinu;

public class Basic {

	public static void displayHighScorePosition(String playerName, int position) {
		System.out.println(playerName + " managed to get into position " + position + " in the high score table");
		
		System.out.println("just testing");
	}

	public static int caclulateHighScorePosition(int playerScore) {
		if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500 && playerScore < 1000) {
			return 2;
		} else if (playerScore >= 100 && playerScore < 500) {
			return 3;
		} else {
			return 4;
		}
	}

	public static void main(String[] args) {

		int johnsPosition = caclulateHighScorePosition(1500);
		displayHighScorePosition("John", johnsPosition);

		int marksPosition = caclulateHighScorePosition(900);
		displayHighScorePosition("Mark", marksPosition);

		int bobsPosition = caclulateHighScorePosition(400);
		displayHighScorePosition("Bob", bobsPosition);

		int janesPosition = caclulateHighScorePosition(50);
		displayHighScorePosition("Jane", janesPosition);

	}
}
