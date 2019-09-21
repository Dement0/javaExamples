package people;

public class Student extends Person {
    
    // Attributes
    private int credits;
    
    // Constructors
    public Student(String name_surname, String address) {
        super(name_surname, address);
        this.credits = 0;
    }
    
    // Methods
    @Override
    public String getNameSurname() {
        return super.getNameSurname();
    }
    
    @Override
    public String getAddress() {
        return super.getAddress();
    }
    
    public int credits() {
        return this.credits;
    }
    
    public void study() {
        this.credits++;
    }
    
    @Override
    public String toString() {
        String result = super.toString() + "\n";
        result += "  credits " + this.credits();
        return result;
    }   
}
