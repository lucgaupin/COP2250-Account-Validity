package module6;
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

public class Accounts {
	
	// ALL THE PUBLIC VARIABLES I DECLARED
	static Scanner in = new Scanner(System.in);
	static int choice;
	final static int SIZE = 200;
	static int i = 0;
	
	// THE ARRAY I DECLEARED
	static int[] validNumber = new int[SIZE];
	
	// READS THE TEXT FILE AND TRAVERSES IT IN ORDER TO DISPLAY ON SCREEN NEED BE
	public static void readTextFile() throws IOException {
		
		// CALLING THE FILE AND THEN SCANNING IT IN
		File file = new File("validNumbers.txt");
		Scanner inputFile = new Scanner(file);
		
		// THIS WILL GO THROUGH EACH LINE IN THE FILE TO PRIME IT AND GET IT LOADED INTO THE ARRAY
		while(inputFile.hasNext() && i < validNumber.length) {
			validNumber[i] = inputFile.nextInt();
			i++;
		}
		// CLOSE THE FILE
		inputFile.close();
	}
	
	// I CREATED THIS INSTEAD OF PUTTING IT IN MAIN TO SIMPLIFY THE PROGRAM
	public static void userChoice() throws IOException {
		
		// WILL ASK FOR THE ACCOUNT NUMBER YOU WANT TO ENTER
		System.out.println("Enter an account number: ");
		choice = in.nextInt();
		// THIS WILL CALL THE VALIDATOR() METHOD AND RUN USER INPUT THROUGH THE VALIDATOR
		validator();
	}
	
	
	public static void validator() throws IOException {
		int counter = validNumber.length;
		// PRIME A FALSE BOOLEAN, WONT BECOME TRUE UNTIL PROGRAM CHECKS USER INPUT
		boolean found = false;
		
		// CALLS THE READ TEXTFILE() METHOD IN ORDER TO MAKE SURE TO CHECK THE FILE FOR MATCHING ACCOUNT NUMBERS
		readTextFile();
		
		// CHECKS THE USER INPUT
		for(int q = 0; q < counter; q++) {
			if(choice == validNumber[q]) {
				found = true;
				System.out.println("Account " + choice + " FOUND");
				calculator();
			}
		}
		
		// IF ITS NOT FOUND THEN IT WILL ADVISE NOT FOUND AND WILL PROMPT THE USER ON WHAT TO DO NEXT
		if(!found) {
			System.out.println("Account NOT found");
			System.out.println(" ");
			next();
		}
	}
	
	public static void next() throws IOException {
		int userChoice = 0;
		
		// PROMPTS THE USER IF ACCOUNT NOT FOUND/ END OF PROGRAM
		System.out.println("What would you like to do?");
		System.out.println("1. Enter Different Account");
		System.out.println("2. Exit");
		userChoice = in.nextInt();
		System.out.println(" ");
		
		// IF THEY WANT TO ENTER DIFF ACCT NUMBER THEN IT LOOPS BACK UP TO THE USERCHOICE() METHOD
		if(userChoice == 1) {
			userChoice();
		}
		// EXITS THE PROGRAM
		else {
			System.out.println("Exit SUCCESSFUL.");
			System.exit(0);
		}
	}

	public static void calculator() throws IOException {
		
		// CONVERTS INT TO STRING
		String str1 = Integer.toString(choice);
		int sum = 0;
		
		// TRAVERSES THE STRING
		for(int j = 0; j < str1.length(); j++) {
			// CALCULATES THE NUMBERS IN THE STRING AND THEN OUTPUTS THE SUM
			sum = sum + Character.getNumericValue(str1.charAt(j));
		}
		// OUTPUTS THE SUM AND WILL THEN ASK USER WHAT THEY'D LIKE TO DO NEXT
		System.out.println("The Added Up Value: " + sum + "\n\n");
		next();
	}
}
