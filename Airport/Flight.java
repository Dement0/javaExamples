import java.util.Objects;

public class Flight {

    // Attributes
    private Plane plane;
    private String departure;
    private String destination;
    
    // Constructors
    public Flight() {
        this(new Plane(), "-", "-");
    }
    
    public Flight(Plane plane, String departure, String destination) {
        this.plane = plane;
        this.departure = departure;
        this.destination = destination;
    }
    
    // Setters & Getters
    public void setPlane(Plane plane) {
        this.plane = plane;
    }
    
    public Plane getPlane() {
        return this.plane;
    }
    
    public void setDeparture(String departure) {
        this.departure = departure;
    }
    
    public String getDeparture() {
        return this.departure;
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public String getDestination() {
        return this.destination;
    }
    
    // Utilities
    @Override
    public String toString() {
        return this.plane + " (" + this.getDeparture() + "-" + this.getDestination() + ")";
    }
    
    @Override
    public boolean equals(Object other) {
        if(other instanceof Flight) {
            // Cast it to Flight Class
            Flight otherFlight = (Flight) other;
            return this.getDeparture().equals(otherFlight.getDeparture()) && 
                   this.getDestination().equals(otherFlight.getDestination()) &&
                   this.getPlane().equals(otherFlight.getPlane());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * Objects.hash(this.getPlane(), this.getDeparture(), this.getDestination());
    }
}
