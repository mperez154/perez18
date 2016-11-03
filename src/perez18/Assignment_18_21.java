


//No longer have to do this assignment



package perez18;

import java.util.Scanner;

public class Assignment_18_21 {
	static int a = 0;
	static int n = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		//calling recursive method
		System.out.println(dec2Bin(number));
		
		input.close();
		
	}
	
	public static String dec2Bin(int value)
	{			
		//while (value < -9 || 9 < value) value /= 10;
		value = (int) Math.floor(value /10);
		return Integer.toBinaryString(Math.abs(value));	
	}

}

/*	Assignment Details:
 
 	(Decimal to binary) Write a recursive method that converts a decimal number
 	into a binary number as a string. The method header is:
 	public static String dec2Bin(int value)
	Write a test program that prompts the user to enter a decimal number and displays
	its binary equivalent.
	
 */