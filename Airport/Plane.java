import java.util.Objects;

public class Plane {

    // Attributes
    private String id;
    private String capacity;
    
    // Constructors
    public Plane() {
        this("-", "-");
    }
    
    public Plane(String id, String capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    
    // Setters & Getters
    public String getId() {
        return this.id;
    }
    
    public String getCapacity() {
        return this.capacity;
    }
    
    // Utilities
    @Override
    public String toString() {
        return this.getId() + " (" + this.getCapacity() + " ppl)";
    }
    
    @Override
    public boolean equals(Object other) {
        if(other instanceof Plane) {
            // Cast it to Plane Class
            Plane otherPlane = (Plane) other;
            return this.getId().equals(otherPlane.getId());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * Objects.hash(this.getId(), this.getCapacity());
    }
}
