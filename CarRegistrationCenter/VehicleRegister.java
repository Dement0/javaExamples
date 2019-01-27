import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class VehicleRegister {

    // Attributes
    private Map<RegistrationPlate, String>owners;
    
    // Constructors
    public VehicleRegister() {
        owners = new HashMap<RegistrationPlate, String>();
    }
    
    // Methods
    public boolean add(RegistrationPlate plate, String owner) {
        // Returns true if the car had no owner
        if(!this.owners.containsKey(plate)) {
            this.owners.put(plate, owner);
            return true;
        }
        return false;
    }
    
    public String get(RegistrationPlate plate) {
        if(this.owners.containsKey(plate)) {
            return this.owners.get(plate);
        }
        return null;
    }
    
    public boolean delete(RegistrationPlate plate) {
        // Returns true if the information was deleted
        if(this.owners.containsKey(plate)) {
            this.owners.remove(plate);
            return true;
        }
        return false;
    }
    
    // Utilities
    public void printRegistrationPlates() {
        for(RegistrationPlate key : this.owners.keySet()) {
            System.out.println(key);
        }
    }
    
    public void printOwners() {
        // Prints all the car owners stored
        // Each owner's name has to be printed only once
        List<String> ownerList = new ArrayList<String>();
        for(RegistrationPlate key : this.owners.keySet()) {
            // Add if not already on the list
            if(!ownerList.contains(this.owners.get(key))) {
                ownerList.add(this.owners.get(key));
            }
        }
        // Print the list
        for(String owner : ownerList) {
            System.out.println(owner);
        }
    }
}
