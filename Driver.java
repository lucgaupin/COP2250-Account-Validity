/*
 * BY...: LUC GAUPIN
 * CLASS: COP2250
 * ASSIG: MODULE 6
 * PROFE: PROFESSOR PISANO
 * PURPO: THIS PROGRAM WILL ASK A USER TO ENTER AN ACCOUNT NUMBER AND CHECK IF ITS VALID AND USE THE ACCOUNT NUMBER TO CALCULATE A VALUE
 * 		  USING THE ACCOUNT NUMBERS ASSOCIATED WITH THE ACCOUNT AND DISPLAY THE OUTPUT TO THE USER
 */

package module6;

// ALL THE IMPORTS I NEED
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		// SCANNER METHOD
		Scanner in = new Scanner(System.in);
		// CREATES A NEW ACCOUNDS OBJECT
		Accounts ac = new Accounts();
		
		// CALLS THE FIRST PART OF THE PROGRAM IN THE ACCOUNTS.JAVA FILE
		Accounts.userChoice();
	}
}

/*

Enter an account number: 
337142
Account 337142 FOUND
The Added Up Value: 20


What would you like to do?
1. Enter Different Account
2. Exit
1
 
Enter an account number: 
908975
Account 908975 FOUND
The Added Up Value: 38


What would you like to do?
1. Enter Different Account
2. Exit
2
 
Exit SUCCESSFUL.

 */