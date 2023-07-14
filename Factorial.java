//Q.4. Write a program to accept a number from user and find the factorial.

package Thursday_lab;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		int i,n,fact=1;										//Initializing
		System.out.println("Enter the Number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)									//starting the loop for continuous execution
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is: "+fact);
	}

}
