package Assignment_Apr3_2023;

public class Assgniment {
	public static void main(String[] args) {
	int num = 5;
	while (num <= 50) {
	    System.out.println(num);
	    num = num + 5;
	    
	    
	    
	}
	System.out.println("--------------------------------------------");
	
	int x = 5;
	int count = 0;
	int sum = 0;
	while (count < 10) {
	    System.out.println(x);
	    sum = sum +  x;
	    x = x + 5;
	    count++;
	}
	System.out.println("Sum of first 10 multiples of 5: " + sum);
	
	System.out.println("--------------------------------------------");
	
	
	int num1 = 99;
	int count1 = 0;
	int sum1 = 0;
	while (count1 < 10) {
	    if (num1 % 11 == 0) {
	        System.out.println(num1);
	        sum1 = sum1 + num1;
	        count1++;
	    }
	    num1--;
	}
	System.out.println("Sum of first 10 multiples of 11 in descending order starting from 99: " + sum1);
	
}
} 


