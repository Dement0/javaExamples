/*
 * A program to manage telephone credits
 *
 */

import java.util.Scanner;

public class TelecomCompanyManager {
	
	public static void main(String[] args) {
		
		// References
		String input;
		String name, surname, telNumber, numToVerify, numToRecharge, numToCheck, date;
		double amount;
		
		// Objects
		Scanner reader = new Scanner(System.in);
		TelephoneCompany myCompany = new TelephoneCompany();
		
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
				case "3": System.out.print("> Tel number to recharge: ");
						  numToRecharge = reader.next();
						  if(myCompany.hasNumber(numToRecharge)) {
						  	System.out.print("> Amount to recharge: ");
						  	amount = Double.parseDouble(reader.next());
						  	myCompany.rechargeNumber(numToRecharge, amount);
						  	System.out.println("Recharged the number " + amount + "€.");
						  }
						  else {
						  	System.out.println("No such number.");
						  }
					break;
				case "4": System.out.print("> Tel number to control the actual credit: ");
						  numToCheck = reader.next();
						  System.out.print("> Amount to charge as debt: ");
						  amount = Double.parseDouble(reader.next());
						  System.out.print("> Date to insert: ");
						  date = reader.next();
						  if(myCompany.chargeNumber(numToCheck, amount, date)) {
						    
						  	System.out.println("Successfully charged with debt. Current credit: " + 												myCompany.getCurrentCredit(numToCheck));
						  }
						  else {
						  	System.out.println("Error.");
						  }
					break;
				case "5": System.out.print("> Tel number to print debts: ");
						  numToCheck = reader.next();
						  if(myCompany.hasNumber(numToCheck)) {
						  	System.out.println(myCompany.getDebts(numToCheck));
						  }
						  else {
						  	System.out.println("No such number.");
						  }
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
		System.out.println("4. Control that the credit of a number is positive, eventually charge him with debt");
		System.out.println("5. Print the debts of a number");
		System.out.println("6. Exit");
		System.out.print("> ");
	}
}
