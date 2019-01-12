public class ComputerPlayer extends Player {
	
	// Attributes

	// Constructors
	public ComputerPlayer() {
		super("CPU");	
	}

	// Methods
	@Override
	public void play() {
		System.out.println("play method called.");
		if(!Game.hasFinished()) {
			Game.nextMove();
		}
	}

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
		if(other instanceof ComputerPlayer) {
			// Cast it to ComputerPlayer object
			ComputerPlayer otherPlayer = (ComputerPlayer) other;
			return (this.getName() == otherPlayer.getName());
		}
		return false;
	}
}
