/*
 * Represents a Tennis Set
 * Depending on the random number generated, decides who wins the set
 */

import java.util.Objects;
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
		double randomGenerated;
		while(!this.hasPlayer1Won() && !this.hasPlayer2Won()) {
			// Generate a random double
			randomGenerated = random.nextDouble();
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
	}

	public boolean hasPlayer1Won() {
		// Check if player2 has won 5 or more games
		if(this.getPlayer2WonGames() >= 5) {
			// If so, check if player1 has won 2 more games than player2
			if(this.getPlayer1WonGames() - this.getPlayer2WonGames() == 2) {
				return true;
			}
			else {
				return false;
			}
		}
		// Else check if player1 has won 6 games
		if(this.getPlayer1WonGames() == 6) {
			// Check if player2 has won less than 5 games
			if(this.getPlayer2WonGames() < 5) {
				return true;
			}
		}
		return false;
	}

	public boolean hasPlayer2Won() {
		// Check if player1 has won 5 or more games
		if(this.getPlayer1WonGames() >= 5) {
			// If so, check if player2 has won 2 more games than player1
			if(this.getPlayer2WonGames() - this.getPlayer1WonGames() == 2) {
				// For example 6-8, 5-7
				return true;
			}
			else {
				// For example 5-6, 7-8
				return false;			
			}
		}
		// Else check if player2 has won 6 games
		if(this.getPlayer2WonGames() == 6) {
			// Check if player1 has won less than 5 games
			if(this.getPlayer1WonGames() < 5) {
				return true;
			}
		}
		return false;
	}

	public int getWinner() {
		// Returns 1 for player1, 2 for player2, 0 for no winner
		// If player1 has won and player2 hasn't win
		if(this.hasPlayer1Won() && !this.hasPlayer2Won()) {
			return 1;
		}
		// If player1 hasn't win and player2 has won
		if(!this.hasPlayer1Won() && this.hasPlayer2Won()) {
			return 2;
		}
		return 0;
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

	@Override
	public int hashCode() {
		return 31 * (Objects.hash(this.getPlayer1WonGames(), this.getPlayer2WonGames()));
	}
}
