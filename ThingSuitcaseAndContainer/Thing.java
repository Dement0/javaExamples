public class Thing {

    // Attributes
    private String name;
    private int weight;
    
    // Constructors
    public Thing() {
        this("-", 0);
    }
    
    public Thing(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    // Setters & Getters
    public void changeName(String name) {
        this.name = name;
    }
    
    public void changeWeigth(int weight) {
        this.weight = weight;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    // Utilities
    @Override
    public String toString() {
        return this.getName() + " (" + this.getWeight() + " kg)";
    }
}
