//Ittehad Qabid Java - Factorial

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorials {
	public static void main(String[] args) {					// Scanner Class object to read input from User/keyboard
		int n = 0;
		int fact = 1;
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Please Enter a Postive Interger: ");		// Asks for user input of a positive integer
			n = Integer.parseInt(bin.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		while (n < 0) {													// Condition if user were to Enter a number less than 0
			System.out.println("Please Try Again,");
			System.out.print("Enter A Non-Negative Number: ");
			try {
				n = Integer.parseInt(bin.readLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		fact = 1;														// Implements Factorial of the user input Integer
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("The Factorial of " + n + " is " + fact);	// Prints the Factorial of the users positive integer input
	}
		
}
			


