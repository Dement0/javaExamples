import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class EventManager {
    public static void main(String[] args) {

        // Create an eventQueue object
        Queue<Event> eventQueue = new LinkedList<>();
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        String input, eventDescription;
	int eventId, keyboardCode, modificatorState;
	int mousePositionX, mousePositionY, pressState;

        // Ask for input
	while(true) {
	    printMenu();
	    input = scanner.next();
	    switch(input) {
		case "1": System.out.print("Event id: ");
			  eventId = Integer.parseInt(scanner.next());
			  System.out.print("Event description: ");
			  eventDescription = scanner.next();
			  System.out.print("Keyboard code: ");
			  keyboardCode = Integer.parseInt(scanner.next());
			  System.out.print("Keyboard modificator state: ");
			  modificatorState = Integer.parseInt(scanner.next());
			  // Create the EventKeyboard object
			  Event keyboardEvent = new EventKeyboard(eventId, eventDescription, keyboardCode, modificatorState);
			  // Add it to the LinkedList
			  try {
			      eventQueue.add(keyboardEvent);
			      System.out.println("Event created.");
			  }
			  catch(IllegalStateException exc) {
			      System.out.println("Error, try again.");
			      exc.printStackTrace();
			  }
			  break;
		case "2": System.out.print("Event id: ");
			  eventId = Integer.parseInt(scanner.next());
			  System.out.print("Event description: ");
			  eventDescription = scanner.next();
			  System.out.print("Mouse position X: ");
			  mousePositionX = Integer.parseInt(scanner.next());
			  System.out.print("Mouse position Y: ");
			  mousePositionY = Integer.parseInt(scanner.next());
			  System.out.print("Mouse press state: ");
			  pressState = Integer.parseInt(scanner.next());
			  // Create the EventMouse object
			  Event mouseEvent = new EventMouse(eventId, eventDescription, mousePositionX, mousePositionY, pressState);
			  // Add it to the LinkedList
			  try {
			      eventQueue.add(mouseEvent);
			      System.out.println("Event created.");
			  }
			  catch (IllegalStateException exc) {
			      System.out.println("Error, try again.");
			      exc.printStackTrace();
			  }
			  break;
		case "3": if(eventQueue.peek() != null) {
			      System.out.println(eventQueue.peek());
			      System.out.println("Event get.");
			  }
			  else {
			      System.out.println("No event found.");
			  }
			  break;
		case "4": if(eventQueue.peek() != null) {
			      System.out.println("Did the event: " + eventQueue.poll());
			  }
			  else {
			      System.out.println("No event to do.");
			  }
			  break;
		case "5": return;
		default : System.out.println("Not a valid operation.");
	    }
	}
    }

    public static void printMenu() {
        System.out.println("Select the operation you want to do:");
        System.out.println("1. Create and insert a new keyboard event");
        System.out.println("2. Create and insert a new mouse event");
        System.out.println("3. Get and visualize an event");
        System.out.println("4. Realize the next event");
        System.out.println("5. Exit");
        System.out.print("> ");
    }
}
