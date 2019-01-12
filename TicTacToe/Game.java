public class Game {

	// Attributes
	private boolean gameOver;
	private int movesAvailable;
	Player player1, player2;
	
	// Constructors
	public Game() {
		this(new HumanPlayer(), new HumanPlayer());
	}
	
	public Game(Player player1, Player player2) {
		this.gameOver = false;
		this.movesAvailable = 9;
		this.player1 = player1;
		this.player2 = player2;
	}
	
	// Methods
	public void finishGame() {
		this.gameOver = true;
	}
	
	public boolean hasFinished() {
		return this.gameOver;
	}
	
	public void nextMove() {
		if(this.movesLeft() > 0) {
			this.movesAvailable--;
			System.out.println("Moves left: " + this.movesLeft());
		}
	}
	
	public int movesLeft() {
		return this.movesAvailable;
	}
	
	// Utilities
	@Override
	public String toString() {
		return ("Game finished?: " + this.hasFinished() + "\n" + "Moves available: " + this.movesLeft());
	}
	
}
