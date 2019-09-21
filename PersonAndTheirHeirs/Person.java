package people;

public class Person {
 
    // Attributes
    private String name_surname, address;
    
    // Constructors
    public Person(String name_surname, String address) {
        this.name_surname = name_surname;
        this.address = address;
    }
    
    // Methods
    public String getNameSurname() {
        return this.name_surname;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    @Override
    public String toString() {
        String result = this.getNameSurname() + "\n";
        result += "  " + this.getAddress();
        return result;
    }
}
