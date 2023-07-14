/*Q.3. Write a program to perform the following operations:
	1. Accept age from the user and check for the eligibility for the voting.
	2. Accept 3 numbers from the user and find the greatest of that.
	3. Accept a number from user and check if it is even or odd.*/

package Thursday_lab;
import java.util.*;
public class Operations {

	public static void main(String[] args) {
		int choice,num1,num2,num3,age,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Voting\n2:Greatest of Numbers\n3:Even or Odd ");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:												//Checking eligibility of age for voting
				System.out.println("Enter Age: ");
				age=sc.nextInt();
				if(age>=18)										//Age must be 18 or greater than 18
				{	
					System.out.println("You are eligible for Voting.");
				}
				else
				{
					System.out.println("You are not eligible for Voting.");
				}
				break;
				
			case 2:												//Checking Greatest of 3 numbers
				System.out.println("Enter three numbers: ");
				num1=sc.nextInt();
				num2=sc.nextInt();
				num3=sc.nextInt();
				if(num1>num2 && num1>num3)						//comparing between numbers
				{
					System.out.println("Number "+num1+" is Greater.");
				}
				else if(num2>num1 && num2>num3)
				{
					System.out.println("Number "+num2+" is Greater.");
				}
				else
				{
					System.out.println("Number "+num3+" is Greater.");
				}
				break;
				
			case 3:												//Checking Even or Odd 
				System.out.println("Enter the number: ");
				n=sc.nextInt();
				if(n%2==0)
				{
					System.out.println("The Number "+n+" is Even.");
				}
				else
				{
					System.out.println("The Number "+n+" is Odd.");
				}
				break;
				
			default:
				System.out.println("Choose Valid Option");
		}

	}

}
