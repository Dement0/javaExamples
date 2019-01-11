import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class EventManager {
    public static void main(String[] args) {

        // Create an eventQueue object
        Queue<Event> eventQueue = new LinkedList<>();
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        String input;

        // Ask for input
	while(true) {
	    printMenu();
	    input = scanner.next();
	    switch(input) {
		case "1": eventQueue.offer(new EventKeyboard());
			  System.out.println("Event created.");
			  break;
		case "2": eventQueue.offer(new EventMouse());
			  System.out.println("Event created.");
			  break;
		case "3": eventQueue.peek();
			  System.out.println("Event get.");
			  break;
		case "4": return;
		default : System.out.println("Not a valid operation.");
	    }
	}
    }

    public static void printMenu() {
        System.out.println("Select the operation you want to do:");
        System.out.println("1. Create and insert a new keyboard event");
        System.out.println("2. Create and insert a new mouse event");
        System.out.println("3. Get and visualize an event");
        System.out.println("4. Exit");
        System.out.print("> ");
    }
}
