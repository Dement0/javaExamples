// Representes a Tennis match

public class Match {
	
	// Attributes
	private Player player1, player2;
	private Set set1, set2, set3;
	
	// Constructors
	public Match() {
		this(new Player(), new Player());
	}
	
	public Match(Player player1, Player player2) {
		setPlayer1(player1);
		setPlayer2(player2);
		setSet1();
		setSet2();
		set3 = null;
	}
	
	// Setters & Getters
	public void setPlayer1(Player player) {
		this.player1 = player;
	}
	
	public void setPlayer2(Player player) {
		this.player2 = player;
	}
	
	public void setSet1() {
		this.set1 = new Set();
	}
	
	public void setSet2() {
		this.set2 = new Set();
	}
	
	public void setSet3() {
		this.set3 = new Set();
	}
	
	public Player getPlayer1() {
		return this.player1;
	}
	
	public Player getPlayer2() {
		return this.player2;
	}
	
	public Set getSet1() {
		return this.set1;
	}
	
	public Set getSet2() {
		return this.set2;
	}
	
	public Set getSet3() {
		return this.set3;
	}
	
	// Methods
	public boolean hasSet3() {
		// Determines if Match has set3
		return (this.getSet3() != null);
	}
	
	public void playMatch() {
		this.getSet1().play();
		this.getSet2().play();
		// TODO
		// Determine if any of the players has won the match
		// If not play the third set
	}
	
	// Utilities
	@Override
	public String toString() {
		String result = "";
		result += "Simulazione set 1: vince " + this.getSet1.toString() + "\n";
		result += "Simulazione set 2: vince " + this.getSet2().toString() + "\n";
		result += (this.hasSet3() ? "Simulazione set 3: vince " + this.getSet3().toString() + "\n" : "");
		return result;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Match)) {
			return false;
		}
		// Cast if to Match
		Match otherMatch = (Match) other;
		return ((this.getPlayer1() == otherMatch.getPlayer1() && this.getPlayer2() == otherMatch.getPlayer2()) && 
				 this.getSet1() == otherMatch.getSet1() && this.getSet2() == otherMatch.getSet2()));
	}
	
	@Override
	public int hashCode() {
		return 31 * this.getPlayer1() * this.getPlayer2();
	}
}
