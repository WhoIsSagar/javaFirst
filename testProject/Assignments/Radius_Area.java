package Assignments;

import java.util.Scanner;

public class Radius_Area {
	
	public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number: ");
    double num = reader.nextInt();
    double area=0;
    area = (3.14* (num*num)) ;  //22.7 *r*r
    System.out.println("Radius is : " + num + "cm");
    System.out.println ("Area is : " +area +"cm");

	}
}