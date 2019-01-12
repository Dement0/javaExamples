// Abstracts the Player concept

import java.util.Objects;

public abstract class Player {

	// Attributes
	String name;

	// Constructors
	public Player() {
		this.name = "-";
	}
	
	public Player(String name) {
		this.name = name;	
	}

	// Methods
	public String getName() {
		return this.name;
	}

	public void play(int position, String sign) {
		if(!Game.hasFinished()) {
			Game.board.set(position, sign);
		}
	}

	public abstract boolean hasWon();

	
	// Utilities
	public int hashCode() {
		return 31 * Objects.hash(this.getName());
	}

}
