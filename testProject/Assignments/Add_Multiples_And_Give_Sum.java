package Assignments;

public class Add_Multiples_And_Give_Sum {

	public static void main(String[] args) {

		int i = 1;
		int j=5;
		int sum = 0;
		while (i <= 10  ) {
			
			System.out.println (j);
			sum = sum + j; //5
			
			j=j+5;//10
			i++;
	}
		System.out.print("The Sum of First 10 Multiples of 5 is :" +sum );
		
	}

}
