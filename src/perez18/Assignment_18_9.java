package perez18;

import java.util.Scanner;

public class Assignment_18_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		String myInteger = input.nextLine();

		// Calling recursive method
		reverseDisplay(myInteger);

		input.close();

	}

	public static void reverseDisplay(String integer) {
		if (integer.length() == 0) {
			System.out.println("\nCompleted");
		} else if (integer.length() == 1) {
			System.out.println(integer);
		} else {
			System.out.print(integer.charAt(integer.length() - 1));
			integer = integer.substring(0, integer.length() - 1);
			reverseDisplay(integer);
		}
	}
}

/*
 * Assignment Details:
 * 
 * (Print the digits in an integer reversely) Write a recursive method that
 * displays an int value reversely on the console using the following header:
 * public static void reverseDisplay(int value) For example,
 * reverseDisplay(12345) displays 54321. Write a test program that prompts the
 * user to enter an integer and displays its reversal.
 * 
 */