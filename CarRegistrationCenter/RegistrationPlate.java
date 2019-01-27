
import java.util.Objects;


public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }
    
    @Override
    public boolean equals(Object other) {
        if(other instanceof RegistrationPlate) {
            // Cast it to RegistrationPlate Class
            RegistrationPlate otherRegistrationPlate = (RegistrationPlate) other;
            return this.regCode.equals(otherRegistrationPlate.regCode) && 
                   this.country.equals(otherRegistrationPlate.country);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * Objects.hash(regCode, country);
    }
}
