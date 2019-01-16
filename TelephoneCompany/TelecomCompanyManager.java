/*
 * A program to manage telephone credits
 *
 */

import java.util.Scanner;

public class TelecomCompanyManager {
	
	public static void main(String[] args) {
		
		// References
		String input;
		String name, surname, telNumber, numToVerify;
		double actualCredit = 0.00D;
		double creditToRecharge = 0.00D;
		double debts = 0.00D;
		
		// Objects
		Scanner reader = new Scanner(System.in);
		TelephoneCompany myCompany = new TelephoneCompany();
		myCompany.addUser(new User("Example", "Foo", "Bar"));
		myCompany.getUser("Example").setCurrentCredit(5.50);
		System.out.println(myCompany.isCreditPositive("Example"));
		myCompany.getUser("Example").recharge(3.00);
		System.out.println(myCompany.getUser("Example").getCurrentCredit());
		myCompany.getUser("Example").charge(9, "01.01.2019");
		System.out.println(myCompany.getUser("Example").getCurrentCredit());
		
		// Execute the main program
		while(true) {
			printMenu();
			input = reader.next();
			switch(input) {
				case "1": System.out.print("Tel number: ");
						  telNumber = reader.next();
						  System.out.print("Name: ");
						  name = reader.next();
						  System.out.print("Surname: ");
						  surname = reader.next();
						  myCompany.addUser(new User(telNumber, name, surname));
						  System.out.println("> Inserted the new user.");
						  System.out.println(myCompany);
					break;
				case "2": System.out.print("> Tel number to verify availability: ");
						  numToVerify = reader.next();
						  System.out.println(myCompany.hasNumber(numToVerify) ? "> Not available" : "> Available");
					break;
				case "3": System.out.println("Recharged the number.");
					break;
				case "4": System.out.println("Controlled the actual credit.");
					break;
				case "5": System.out.println("Printed the debts.");
					break;
				case "6": return;
				default : System.out.println("Not a valid operation!");
			}
		}
	}
	
	public static void printMenu() {
		System.out.println("------ Telecom Company Manager ------");
		System.out.println("Please enter the corresponding number for the operation you want to execute");
		System.out.println("1. Insert a new user");
		System.out.println("2. Verify that a new number is available");
		System.out.println("3. Recharge a number");
		System.out.println("4. Control that the credit of a number is positive, if not charge a debit");
		System.out.println("5. Print the debts of a number");
		System.out.println("6. Exit");
		System.out.print("> ");
	}
}
