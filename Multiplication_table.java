//Q.5. Write a program to accept a number from the user and display the multiplication table (5*1=5).

package Thursday_lab;
import java.util.*;
public class Multiplication_table {

	public static void main(String[] args) {
		int number,i;
		System.out.println("Enter the Number: ");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		for(i=1;i<=10;i++)										//starting the loop
		{
			System.out.println(number+"*"+i+"="+(number*i));
		}
	}

}