import java.util.Objects;

public class Bird {

    // Attributes
    private String name, latinName;
    
    // Constructors
    public Bird() {
        this("-", "-");
    }
    
    public Bird(String name, String latinName) {
        setName(name);
        setLatinName(latinName);
    }
    
    // Setters & Getters
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    // Utilities
    @Override
    public String toString() {
        return this.getName() + " (" + this.getLatinName() + ")";
    }
    
    @Override
    public boolean equals(Object other) {
        if(other instanceof Bird) {
            // Cast it to Bird
            Bird otherBird = (Bird) other;
            return (this.getName().equals(otherBird.getName()) && 
                    this.getLatinName().equals(otherBird.getLatinName()));
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * Objects.hash(this.getName(), this.getLatinName());
    }
}
