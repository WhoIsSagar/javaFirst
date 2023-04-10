package Assignments;

import java.util.Scanner;

public class Months_Output_Programme {
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
	    System.out.print("Enter a Number: ");
	    int num = reader.nextInt();
	    
	    if (num == 1) {
	    	System.out.print("The month is January ");
	    	
	    } else if (num == 2) {
	     	System.out.print("The month is February ");
	    } else if (num == 3) {
	     	System.out.print("The month is March ");
	    } else if (num == 3) {
	     	System.out.print("The month is April ");
	    } else if (num == 5) {
	     	System.out.print("The month is May ");
	    } else if (num == 6) {
	     	System.out.print("The month is June ");
	    } else if (num == 7) {
	     	System.out.print("The month is July ");
	    } else if (num == 8) {
	     	System.out.print("The month is August ");
	    } else if (num == 9) {
	     	System.out.print("The month is September ");
	    } else if (num == 10) {
	     	System.out.print("The month is October ");
	    } else if (num == 11) {
	     	System.out.print("The month is November ");
	    } else if (num == 12) {
	     	System.out.print("The month is December ");
	    } else  {
	     	System.out.print("Invalid Entry. Please enter a number b/w 1-12");
	    }
	    
}
}