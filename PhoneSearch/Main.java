
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        // Scanner object
        Scanner scanner = new Scanner(System.in);
        String input;
        
        // Print menu
        while(true) {
            printMenu();
            
            // Read the input
            input = scanner.next();
            
            // Switch according to input
            switch(input) {
                case "1": System.out.println("Entered 1");
                    break;
                case "2": System.out.println("Entered 2");
                    break;
                case "3": System.out.println("Entered 3");
                    break;
                case "4": System.out.println("Entered 4");
                    break;
                case "5": System.out.println("Entered 5");
                    break;
                case "6": System.out.println("Entered 6");
                    break;
                case "7": System.out.println("Entered 7");
                    break;
                case "x": System.out.println("Quiting...");
                    return;
                default: System.out.println("Not a valid operation!");
            }
        }
    }
    
    public static void printMenu() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
    }
}
