package Assignments;

import java.util.Scanner;

public class Table_Programme {

	public static void main(String[] args) {
		
		
		    Scanner reader = new Scanner(System.in);
		    System.out.print("Enter a number: ");
		    int num = reader.nextInt();
		    int i;
		    int x; 
		    for (i=1; i<=10; i++ ) {
		    	
		    	  x = num * i ;
			    	System.out.println(x);
		    }
		   
	}
}
