package Assignments;
import java.util.Scanner;


public class Even_Odd_Sum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        System.out.print("Enter an integer Press 0 to quit ");
        int num = input.nextInt();

        while (num != 0) {
            if (num % 2 == 0) {
                evenSum = evenSum+num;
            } else {
                oddSum = oddSum + num;
            }

            System.out.print("Enter an integer. Press 0 to quit ");
            num = input.nextInt();
        }

        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
	}
}
