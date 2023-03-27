package package2;

import java.util.Scanner;
public class class2 {

	public static void main(String[] args) {
		  int i;
	       for (i=1;i<=10;i++)
	        System.out.println(i);
	     
	        int x = 1;
	        System.out.println("Even numbers");
	        while(x<=10){
	            System.out.println(x * 2);
	           x++;

	    }
	     Scanner reader = new Scanner(System.in);
	            System.out.print("Enter a number: ");
	        int num = reader.nextInt();

	        if(num % 2 == 0)
	            System.out.println(num + " is even");
	        else
	            System.out.println(num + " is odd");
	        
	        int p,fact=1; 
	        System.out.print("Enter a Number");
	        int q = reader.nextInt();
	        for (p=1;p<=q; p++) {
	        	fact = fact * p;
	        	
	        }
	        System.out.println("Factorial of" + q + "is" +fact);
	        
	        
	        
	        int b,m=0,flag=0;            
	        System.out.print("Enter a Number");
	        int n = reader.nextInt();
	        m=n/2;      
	        if(n==0||n==1){  
	         System.out.println(n+" is not prime number");      
	        }else{  
	         for(b=2;i<=m;b++){      
	          if(n%i==0){      
	           System.out.println(n+" is not prime number");      
	           flag=1;      
	           break;      
	          }      
	         }      
	         if(flag==0)  { System.out.println(n+" is prime number"); }  
	        }//end of else  
	        
	        
	}
}