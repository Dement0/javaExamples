// Representes a Tennis player

public class Player {
	// Fields
	private int classification;
	private String name, surname;
	
	// Constructors
	public Player() {
		this(500, "-", "-");
	}
	
	public Player(int classification, String name, String surname) {
		setClassification(classification);
		setName(name);
		setSurname(surname);
	}
	
	// Setters & Getters
	public void setClassification(int classification) {
		this.classification = classification;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getClassification() {
		return this.classification;
	}
	
	public int getName() {
		return this.name;
	}
	
	public int getSurname() {
		return this.surname;
	}
	
	// Utilities
	@Override
	public String toString() {
		String result = "";
		result += this.getName() + " " + this.getSurname() + " " + this.getClassification();
		return result;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Player)) {
			return false;
		}
		Player otherPlayer = (Player) other;
		return (this.getName() == otherPlayer.getName() && this.getSurname() == otherPlayer.getSurname() && this.getClassification() == otherPlayer.getClassification());
	}
	
	@Override
	public int hashCode() {
		return 31 * this.getClassification() * this.getName() * this.getSurname();
	}
}
