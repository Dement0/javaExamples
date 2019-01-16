import java.util.List;
import java.util.ArrayList;

public class User {
	
	// Attributes
	private String telNumber, name, surname;
	private double currentCredit;
	private List<String> debts;
	private Database db;
	
	// Constructors
	public User() {
		this("-", "-", "-");
	}
	
	public User(String telNumber, String name, String surname) {
		setTelNumber(telNumber);
		setName(name);
		setSurname(surname);
		setCurrentCredit(0.00D);
		this.debts = new ArrayList<String>();
	}
	
	// Setters & Getters
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	
	public String getTelNumber() {
		return this.telNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public void setCurrentCredit(double currentCredit) {
		this.currentCredit = currentCredit;
	}
	
	public double getCurrentCredit() {
		return this.currentCredit;
	}
	
	public void addDebt(double debt) {
		this.debts.add("" + debt);
	}
	
	public String getDebts() {
		String result = "";
		if(!(this.debts.isEmpty())) {
			for(String debt : debts) {
				result += debt + "\n";
			}
		}
		return result;
	}
	
	// Methods
	public void recharge(double amount) {
		double currentCredit = this.getCurrentCredit();
		currentCredit += amount;
		this.setCurrentCredit(currentCredit);
	}
	
	public void charge(double debt, String date) {
		this.recharge(-debt);
		String debtToRegister = debt + " - "+ date;
		debts.add(debtToRegister);
	}
	
	// Utilities
	@Override
	public String toString() {
		return this.getName() + " " + this.getSurname() + ", " + this.getTelNumber();
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof User) {
		// Cast it to User
		User otherUser = (User) other;
			return this.getName().equals(otherUser.getName()) && 
				   this.getSurname().equals(otherUser.getSurname()) && 
				   this.getTelNumber().equals(otherUser.getTelNumber());
		}
		return false;
	}
}
