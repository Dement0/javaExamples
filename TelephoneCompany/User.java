import java.util.list;
import java.util.ArrayList;

public class User {
	
	// Attributes
	private String telNumber, name, surname;
	private double currentCredit;
	private List<Double> debts;
	
	// Constructors
	public User() {
		this("-", "-", "-");
	}
	
	public User(String telNumber, String name, String surname) {
		setTelNumber(telNumber);
		setName(name);
		setSurname(surname);
		setCurrentCredit(0.00D);
		this.debts = new ArrayList<Double>();
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
		this.debts.add(debt);
	}
	
	public double getDebts() {
		double result = 0.00d;
		if(!(this.debts.isEmpty())) {
			for(Double debt : debts) {
				result += debt;
			}
		}
		return result;
	}
	
	// Utilities
	@Override
	public String toString() {
		return this.getName() + " " + this.getSurname() + ", " + this.getTelNumber();
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof User) {
			return this.getName().equals(other.getName()) && 
				   this.getSurname().equals(other.getSurname()) && 
				   this.getTelNumber().equals(other.getTelNumber());
		}
		return false;
	}
}
