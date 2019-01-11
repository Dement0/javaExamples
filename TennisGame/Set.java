/*
 * Represents a Tennis Set
 * Depending on the random number generated, decides who wins the set
 */

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Set {
	private int player1WonGames;
	private int player2WonGames;
	private List<String> setHistory;
	Random random = new Random();
	
	// Setters & Getters
	public void setPlayer1WonGames(int player1WonGames) {
		this.player1WonGames = player1WonGames;
	}
	
	public int getPlayer1WonGames() {
		return this.player1WonGames;
	}
	
	public void player2WonGames(int player2WonGames) {
		this.player2WonGames = player2WonGames;
	}
	
	public int getPlayer2WonGames() {
		return this.player2WonGames;
	}
	
	// Constructors
	public Set() {
		this.player1WonGames = 0;
		this.player2WonGames = 0;
		this.setHistory = new ArrayList<String>();
	}
	
	// Methods
	public void play() {
		// Generate a random double
		double randomGenerated = random.nextDouble();
		// If less than 0.5 increment player1WonGames
		if(randomGenerated < 0.5) {
			this.player1WonGames++;
		}
		// Else increment player2WonGames
		else {
			this.player2WonGames++;
		}
    // Add it to setHistory
		this.setHistory.add(this.getPlayer1WonGames() + "-" + this.getPlayer2WonGames());
	}
	
	// Utilities
	@Override
	public String toString() {
		String result = "";
		for(String history : setHistory) {
			result += history + ", ";
		}
		return result;
	}
}
