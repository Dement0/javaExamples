import java.util.Map;
import java.util.HashMap;

public class TelephoneCompany {

	// Attributes
	private String companyName;
	private Map<String, User> users;
	
	// Constructors
	public TelephoneCompany() {
		this("Example Company");
	}
	
	public TelephoneCompany(String companyName) {
		setCompanyName(companyName);
		this.users = new HashMap<>();
	}
	
	// Setters & Getters
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	
	// Methods
	public void addUser(User user) {
		this.users.put(user.getTelNumber(), user);
	}
	
	public User getUser(String telNumber) {
		return this.users.get(telNumber);
	}
	
	public boolean isCreditPositive(String telNumber) {
		if(this.hasNumber(telNumber)) {
			return (this.users.get(telNumber).getCurrentCredit() > 0);
		}
		return false;
	}
	
	public boolean hasNumber(String telNumber) {
		return this.users.containsKey(telNumber);
	}
	
	public void rechargeNumber(String telNumber, double amount) {
		// Inserts credit to a tel number
		if(this.hasNumber(telNumber)) {
			this.getUser(telNumber).recharge(amount);
		}
	}
	
	public boolean canChargeNumber(String telNumber) {
		return this.getUser(telNumber).getCurrentCredit() > 0;
	}
	
	public boolean chargeNumber(String telNumber, double debt, String date) {
		// Inserts debt to a tel number
		if(this.hasNumber(telNumber) && this.canChargeNumber(telNumber)) {
			this.getUser(telNumber).charge(debt, date);
			return true;
		}
		return false;
	}

	public double getCurrentCredit(String telNumber) {
		if(this.hasNumber(telNumber)) {
			return this.getUser(telNumber).getCurrentCredit();
		}
		return 0.00D;
	}
	
	public String getDebts(String telNumber) {
		if(hasNumber(telNumber)) {
			return this.getUser(telNumber).getDebts();
		}
		return "";
	}
	
	// Utilities
	@Override
	public String toString() {
		String result = this.getCompanyName();
		// Check if it's empty
		if(this.users.isEmpty()) {
			result += ", no users yet.";
			return result;
		}
		result += ", " + this.users.size() + " users registered.";
		return result;
	}
}
