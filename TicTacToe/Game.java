import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	// Attributes
	static boolean gameOver;
	private int movesAvailable;
	Player player1, player2;
	static List<String> board;
	Scanner scanner;
	
	// Constructors
	public Game() {
		this(new HumanPlayer(), new HumanPlayer());
	}
	
	public Game(Player player1, Player player2) {
		this.gameOver = false;
		this.movesAvailable = 9;
		this.player1 = player1;
		this.player2 = player2;
		board = new ArrayList<String>(9);
		for(int i = 1; i <= 9; i++) {
			board.add(null);
		}
		scanner = new Scanner(System.in);
	}
	
	// Methods
	public static void finishGame() {
		gameOver = true;
	}
	
	public static boolean hasFinished() {
		return gameOver;
	}
	
	public void nextMove() {
		if(this.movesLeft() > 0) {
			this.movesAvailable--;
			System.out.println("Moves available: " + this.movesLeft());
		}
		else {
			finishGame();
		}
	}
	
	public int movesLeft() {
		return this.movesAvailable;
	}
	
	public void play() {
		int input;
		while(!hasFinished()) {
			// Ask for position
			System.out.print("Position 1-9: ");
			input = Integer.parseInt(scanner.next()) - 1;
			player1.play(input, "X");
			this.nextMove();
			this.printBoard();
			// Check if hasFinished
			if(this.movesLeft() == 0) {
				break;
			}
			System.out.print("Position 1-9: ");
			input = Integer.parseInt(scanner.next()) - 1;
			player2.play(input, "O");
			this.nextMove();
			this.printBoard();		
		}
	}
	
	public void printBoard() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(board.get(i * 3 + j) != null ? board.get(i * 3 + j) : "-");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// Utilities
	@Override
	public String toString() {
		return ("Game finished?: " + hasFinished() + "\n" + "Moves available: " + movesLeft());
	}
	
}
