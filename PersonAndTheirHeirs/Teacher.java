package people;

public class Teacher extends Person {
    
    // Attributes
    private int salary;
    
    // Constructors
    public Teacher(String name_surname, String address, int salary) {
        super(name_surname, address);
        this.salary = salary;
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
    
    public int getSalary() {
        return this.salary;
    }
    
    @Override
    public String toString() {
        String result = super.toString() + "\n";
        result += "  salary " + this.getSalary() + " euros/month";
        return result;
    }
}
