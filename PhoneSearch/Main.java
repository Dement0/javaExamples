
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        // Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // References
        String address, city, input, keyword, name, number, street;
        Contact contact;
        
        // PhoneBook object
        PhoneBook phoneBook = new PhoneBook();
        
        List<Contact> keywordSearchResults = new ArrayList<Contact>();
        
        // Print menu
        while(true) {
            printMenu();
            
            // Read the input
            input = scanner.next();
            
            // Switch according to input
            if("1".equals(input)) {
                    System.out.print("whose number: ");
                    name = scanner.next();
                    System.out.print("number: ");
                    number = scanner.next();
                    
                    // Check if contact exists, else create if
                    if(!phoneBook.containsContact(name)) {
                        contact = new Contact(name);
                    } else {
                        contact = phoneBook.getContactByName(name);
                    }
                    contact.addNumber(number);
                    
                    // Insert contact
                    phoneBook.addNumber(contact, number);
                    System.out.println("");
            } else if("2".equals(input)) {
                    System.out.print("whose number: ");
                    name = scanner.next();
                    
                    // If exists print number, else "  not found"
                    if(!phoneBook.containsContact(name)) {
                        System.out.println("  not found");
                    } else {
                        phoneBook.getContactByName(name).printNumbers();
                    }
            } else if("3".equals(input)) {
                    System.out.print("number: ");
                    number = scanner.next();
                  
                    // If number exists print name, else "  not found"
                    if(phoneBook.getContactByNumber(number) == null) {
                        System.out.println("  not found");
                    } else {
                        System.out.println(" " + phoneBook.getContactByNumber(number).getName());
                    }
            } else if("4".equals(input)) {
                    System.out.print("whose address: ");
                    name = scanner.next();
                    System.out.print("street: ");
                    street = scanner.next();
                    System.out.print("city: ");
                    city = scanner.next();
                    address = street + " " + city;
                    
                    // Check if contact exists, else create it
                    if(phoneBook.getContactByName(name) == null) {
                        contact = new Contact(name);
                        phoneBook.addNumber(contact, "");
                    }
                    
                    // Add address
                    phoneBook.getContactByName(name).addAddress(address);
                    System.out.println("");
            } else if("5".equals(input)) {
                    System.out.print("whose information: ");
                    name = scanner.next();
                                       
                    // If contact does not exist, print "  not found"
                    if(!phoneBook.containsContact(name)) {
                        System.out.println("  not found");
                    }
                    
                    // Else print numbers
                    System.out.println(phoneBook.getContactByName(name));
            } else if("6".equals(input)) {
                    System.out.print("whose information: ");
                    name = scanner.next();
                    
                    // Delete contact
                    contact = phoneBook.getContactByName(name);
                    if(contact != null) {
                        phoneBook.deleteContact(contact);
                    }
            } else if("7".equals(input)) {
                    System.out.print("keyword (if empty, all listed): ");
                    keyword = scanner.next();
                    keywordSearchResults = phoneBook.searchWithKeyword(keyword);
                    
                    if(keywordSearchResults.isEmpty()) {
                        System.out.println(" keyword not found");
                    } else {
                        System.out.println("");

                        for(Contact result : keywordSearchResults) {
                            System.out.println(" " + result.getName());
                            System.out.println(result);
                            System.out.println();
                        }
                    }
            } else if("x".equals(input)) {
                    return;
            } else {
                System.out.println("Not a valid operation!");
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
        System.out.println("");
        System.out.print("command: ");
    }
}
