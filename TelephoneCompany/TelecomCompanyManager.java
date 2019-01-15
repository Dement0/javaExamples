/*
 * A program to manage telephone credits
 *
 */

import java.util.Scanner;

public class TelecomCompanyManager {
	
	public static void main(String[] args) {
		
		// References
		String input;
		String name, surname, telNumber;
		double actualCredit = 0.00D;
		double creditToRecharge = 0.00D;
		double debts = 0.00D;
		
		// Scanner Object
		Scanner reader = new Scanner(System.in);
		
		// Execute the main program
		while(true) {
			printMenu();
			input = reader.next();
			switch(input) {
				case "1": System.out.println("Inserted the new user.");
					break;
				case "2": System.out.println("Verified the number availability.");
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
		System.out.print("Please enter the corresponding number for the operation you want to execute");
		System.out.println("1. Insert a new user");
		System.out.println("2. Verify that a new number is available");
		System.out.println("3. Recharge a number");
		System.out.println("4. Control that the credit of a number is positive, if not charge a debit");
		System.out.println("5. Print the debts of a number");
		System.out.println("6. Exit");
		System.out.print("> ");
	}
}
