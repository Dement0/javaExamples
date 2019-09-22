package boxes;

import java.util.Objects;

public class Thing {

    // Attributes
    private String name;
    private int weight;

    // Constructors
    public Thing(String name, int weight) throws IllegalArgumentException {
        if(weight < 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    // Methods
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Thing)) {
            return false;
        }
        
        // Cast to Thing
        Thing otherThing = (Thing) other;
        
        return ((this.getName().equals(otherThing.getName())));
    }
    
    @Override
    public int hashCode() {
        return 31 * Objects.hash(this.getName());
    }
}
