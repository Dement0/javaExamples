public class HumanPlayer extends Player {
	
	// Attributes

	// Constructors
	public HumanPlayer() {
		super();
	}
	
	public HumanPlayer(String name) {
		super(name);	
	}

	// Methods
	@Override
	public boolean hasWon() {
		System.out.println("hasWon method called.");
		return false;
	}
	
	// Utilities
	@Override
	public String toString() {
		return this.getName(); 
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof HumanPlayer) {
			// Cast it to HumanPlayer object
			HumanPlayer otherPlayer = (HumanPlayer) other;
			return (this.getName() == otherPlayer.getName());
		}
		return false;
	}
}
