package Assignments;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
	    System.out.print("Enter 1st number: ");
	    float x = reader.nextFloat();
	    Scanner reader1 = new Scanner(System.in);
	    System.out.print("Enter 2nd number: ");
	    float  y= reader1.nextFloat();
	    System.out.println(("Result of Addition is : ") + (x + y) );
	    System.out.println(("Result of Subtraction is : ") + (x - y) );
	    System.out.println(("Result of Multiplication is : ") + (x * y) );
	    System.out.println(("Result of Devision is : ") + (x / y) );
	    System.out.println(("Reminder is : ") + (x % y) );
	}

}
