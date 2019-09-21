package containers;

public class ProductContainer extends Container {
    
    // Attributes
    private String name;
    
    // Constructors
    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.name = productName;
    }
    
    // Methods
    public String getName() {
        return this.name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    @Override
    public String toString() {
        return (this.getName() + ": " + super.toString());
    }   
}
