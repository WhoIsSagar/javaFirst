package Assignments;

import java.util.Scanner;

public class Reversed_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int num = input.nextInt();

	        int reversedNum = 0;

	        while (num != 0) {
	            int digit = num % 10; //extracting last digit 
	            reversedNum = reversedNum * 10 + digit;
	            num = num / 10;
	        }

	        System.out.println("The reversed number is " + reversedNum);

	      
	}

}
