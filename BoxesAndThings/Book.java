public class Book implements ToBeStored{
    
    // Attributes
    private String writer, name;
    private double weight;
    
    // Constructors
    public Book() {
        this("-", "-", 0.00D);
    }
    
    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }
    
    // Methods
    public String getWriter() {
        return this.writer;
    }
   
    public String getName() {
        return this.name;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    @Override
    public double weight() {
        return 0.00;
    }
    
    // Utilities
    
}
