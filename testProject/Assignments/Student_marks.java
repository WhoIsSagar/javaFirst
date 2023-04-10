package Assignments;

import java.util.Scanner;

public class Student_marks {
	
	public static void main(String[] args) {
		
		
	    Scanner reader = new Scanner(System.in);
	    System.out.println("Enter a number b/w (1 or 0) : ");
	    System.out.println("Enter 1 for entering marks, 0 for exiting");
	    float x = reader.nextFloat();
	    
	    if(x==1)  {
	    	Scanner reader1 = new Scanner(System.in);
		    System.out.println("Please enter Marks");
		
		    float marks = reader1.nextFloat();
		    
		    if (marks >= 90 ) {
			    System.out.println("That is Good! ");	
		    }else if ((marks >= 60) && (marks <=89 ) ) {
			    System.out.println("That is also Good! ");	
		    }else if ((marks >= 0) && (marks <=59 ) ) {
			    System.out.println("That is also Good! Because marks does not matter, efforts does ");	
		    }else {
		    	System.out.println("Please enter Valid Marks");
		    }
		    
		    } else if (x==0) {
		    	System.out.println("Thank You!");
		    }else {
		    	System.out.println("Please input 1 or 0 ");
		    }
	    }
	    
	    
	    
	    
}
