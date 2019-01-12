public class TennisTest {
	public static void main(String[] args) {

		// Create 2 Player objects
		Player player1 = new Player(25, "John", "Doe");
		Player player2 = new Player(46, "Lorem", "Ipsum");

		// Create a Match object with Players
		Match match = new Match(player1, player2);

		// Print
		match.playMatch();
		System.out.println(match);
	}
}
