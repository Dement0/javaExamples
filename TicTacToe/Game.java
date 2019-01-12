public class Game {

	// Attributes
	private static boolean gameOver;
	private static int movesAvailable;
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
	public static void finishGame() {
		gameOver = true;
	}
	
	public static boolean hasFinished() {
		return gameOver;
	}
	
	public static void nextMove() {
		if(movesLeft() > 0) {
			movesAvailable--;
			System.out.println("Moves left: " + movesLeft());
		}
		else {
			finishGame();
		}
	}
	
	public static int movesLeft() {
		return movesAvailable;
	}
	
	public void play() {
		while(!hasFinished()) {
			player1.play();				
		}
	}
	
	// Utilities
	@Override
	public String toString() {
		return ("Game finished?: " + hasFinished() + "\n" + "Moves available: " + movesLeft());
	}
	
}
