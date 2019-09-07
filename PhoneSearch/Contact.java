import java.util.ArrayList;
import java.util.List;

public class Contact {
    
    // Attributes
    private String address, name;
    private List<String> numbers;
    
    // Constructor
    public Contact(String name) {
        this.name = name;
        this.numbers = new ArrayList<String>();
        this.address = "address unknown";
    }
    
    // Methods
    public void addNumber(String number) {
        this.numbers.add(number);
    }
    
    public List<String> getNumbers() {
        return this.numbers;
    }
    
    public void addAddress(String address) {
        this.address = address;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public boolean hasAddress() {
        return (!this.getAddress().equals("address unknown"));
    }
    
    public String getName() {
        return this.name;
    }
    
    public boolean hasNumber(String number) {
        return this.numbers.contains(number);
    }
    
    @Override
    public String toString() {
        String info = "";
        
        if(this.hasAddress()) {
            info += "  address: " + this.getAddress() + "\n";
        } else {
            info += "  " + this.getAddress() + "\n";
        }
        
        if(this.getNumbers().isEmpty()) {
            info += "  phone number not found";
            return info;
        }
        
        info += "  phone numbers:" + "\n";

        for(String num : this.getNumbers()) {
            info += "   " + num + "\n";
        }
        return info;
    }
    
    public void printNumbers() {
        for(String number : this.numbers) {
            System.out.println(" " + number);
        }
    }
}
