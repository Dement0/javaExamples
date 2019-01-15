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
	
	public void setCurrentCredit(double currentCredit) {
		this.currentCredit = currentCredit;
	}
	
	public double getCurrentCredit() {
		return this.currentCredit;
	}
}
