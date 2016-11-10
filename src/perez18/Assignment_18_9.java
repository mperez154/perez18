package perez18;

import java.util.Scanner;

public class Assignment_18_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		String myInteger = input.nextLine();

		// Calling recursive method
		System.out.println(reverseDisplay2(myInteger));

		input.close();

	}
	
	public static int reverseDisplay2(String integer) {
		if (integer.length() == 0) {
			return 0;
		} else if (integer.length() == 1) {
			return Integer.parseInt(integer);
		} else {
			System.out.print(integer.charAt(integer.length() - 1));
			integer = integer.substring(0, integer.length() - 1);
			return reverseDisplay2(integer);
		}
	}
	
}