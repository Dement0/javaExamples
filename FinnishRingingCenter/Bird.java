
import java.util.Objects;


public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    // Methods
    public String getName() {
        return this.name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public int getRingingYear() {
        return this.ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    @Override
    public boolean equals(Object other) {
        if(other instanceof Bird) {
            // Cast it to Bird
            Bird otherBird = (Bird) other;
            
            return ((this.getRingingYear() == (otherBird.getRingingYear())) && 
                    (this.getLatinName().equals(otherBird.getLatinName())));
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * Objects.hash(this.getRingingYear(), this.getLatinName());
    }
}
