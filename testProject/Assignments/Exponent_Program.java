package Assignments;
import java.util.Scanner;

public class Exponent_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = input.nextDouble();

        System.out.print("Enter the exponent number: ");
        int exponent = input.nextInt();

        double result = 1;

        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }

        System.out.println(base + " raised to the power of " + exponent + " is " + result);

     
	}

}
