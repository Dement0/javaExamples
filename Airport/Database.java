import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Database {
        
    // Attributes
    private Map<String, Plane> planes;
    private List<Flight> flights;
    
    // Constructors
    public Database() {
        planes = new HashMap<String, Plane>();
        flights = new ArrayList<Flight>();
    }
    
    // Methods
    public void addPlane(Plane plane) {
        this.planes.put(plane.getId(), plane);
    }
    
    public Plane getPlane(String id) {
        if(this.planes.containsKey(id)) {
            return this.planes.get(id);
        }
        return null;
    }
    
    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }
    
    public void printPlanes() {
        if(!(this.planes.isEmpty())) {
            for(String id : this.planes.keySet()) {
                System.out.println(this.planes.get(id));
            }
        } else {
            System.out.println("No plane found.");
        }
    }
    
    public void printFlights() {
        if(!(this.flights.isEmpty())) {
            for(Flight flight : this.flights) {
                System.out.println(flight);
            }
        } else {
            System.out.println("No flight found.");
        }
    }
    
    public void printPlaneInfo(String id) {
        if(this.planes.containsKey(id)) {
            System.out.println(this.planes.get(id));
        } else {
            System.out.println("No such plane.");
        }
    }
}
