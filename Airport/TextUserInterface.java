import java.util.Scanner;

public class TextUserInterface {

    // Attributes
    private Scanner reader;
    private Database db;
    
    // Constructors
    public TextUserInterface(Scanner reader, Database db) {
        this.reader = reader;
        this.db = db;
    }
    
    // Methods
    public void start() {
        String input, id, capacity, departure, destination;
        Plane plane;
        // First loop for Airport panel
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        while(true) {
            this.printAirportPanel();
            input = this.reader.nextLine();
            if(input.equals("1")) {
                System.out.print("Give plane ID: ");
                id = this.reader.nextLine();
                System.out.print("Give plane capacity: ");
                capacity = this.reader.nextLine();
                // Add new Plane to db
                this.db.addPlane(new Plane(id, capacity));
            } else if(input.equals("2")) {
                System.out.println("Give plane ID: ");
                id = this.reader.nextLine();
                System.out.print("Give departure airport code: ");
                departure = this.reader.nextLine();
                System.out.print("Give destination airport code: ");
                destination = this.reader.nextLine();
                // Get the plane from Planes
                plane = this.db.getPlane(id);
                // Add new Flight to db
                this.db.addFlight(new Flight(plane, departure, destination));
            } else if(input.equals("x")) {
                break;
            }
        }
        
        // Second loop for Flight service
        System.out.println("");
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        while(true) {
            this.printFlightService();
            input = this.reader.nextLine();
            if(input.equals("1")) {
                this.db.printPlanes();
            } else if(input.equals("2")) {
                this.db.printFlights();
            } else if(input.equals("3")) {
                System.out.print("Give plane ID: ");
                id = this.reader.nextLine();
                this.db.printPlaneInfo(id);
            } else if(input.equals("x")) {
                break;
            }
        }
    }
    
    public void printAirportPanel() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
    }
    
    public void printFlightService() {
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
    }
}
