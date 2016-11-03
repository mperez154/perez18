package perez18;

import java.util.Scanner;

public class Assignment_18_21b {
	private static double value = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numerator first, followed by the denominator");
		double numerator = input.nextDouble();
		double denominator = input.nextDouble();
			
		//Calling recursive method
		divideTwoNumbers(numerator, denominator);
		
		input.close();

	}
	
	public static void divideTwoNumbers(double numerator , double denominator)
	{			
		if(numerator < denominator)
		{
			value = value + (numerator/denominator);
			System.out.println("The quotient is " + value);
		}
		else
		{
			numerator = (numerator - denominator);
			value++;
			divideTwoNumbers(numerator, denominator);
		}
		
	}

}


/*	EXERCISE:
 
	To answer "How many times does 7 divide into 40?", you could determine how many times 7 can be subtracted from 40. 
	Write a recursive function that divides two doubles by using recursive subtraction. See example output.
	
	EXAMPLE OUTPUT
	
	Enter two doubles, in descending order
	12
	7
	The quotient is 1.7142857142857144
	
*/