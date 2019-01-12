public class TicTacToe {
	public static void main(String[] args) {
	
		// Create player objects
		Player player1 = new HumanPlayer("John Doe");
		Player player2 = new ComputerPlayer();
		
		// Create new game
		Game game = new Game(player1, player2);
		
		System.out.println(game);
	}
}
