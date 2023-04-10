package Assignments;

public class Hollow_Square {

	public static void main(String[] args) {
		
		int rows = 4;
        int cols = 5;

      
        for (int i = 1; i <= cols; i++) {
            System.out.print("* ");
        }
        System.out.println();

       
        for (int i = 2; i < rows; i++) {
            System.out.print("* ");
            for (int j = 2; j < cols; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

     
        for (int i = 1; i <= cols; i++) {
            System.out.print("* ");
        }
    }
}
