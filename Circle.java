//Q.1. Write a program to accept the radius from the user and calculate the Area of Circle and Circumference of Circle.

package Thursday_lab;
import java.util.*;
public class Circle {

	public static void main(String[] args) {
		
		double r;
		double pi=3.14;									// The value of PI is 3.14
		System.out.println("Enter the Radius: ");		// User input for radius	
		Scanner sc=new Scanner(System.in);
		r=sc.nextDouble();
		System.out.println("Area of Circle= "+(pi*r*r));			//Area of Circle = PI*r^2	
		System.out.println("Circumference of Circle= "+(2*pi*r));	//Circumference of Circle = 2*PI*r

	}

}
