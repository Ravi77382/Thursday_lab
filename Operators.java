//Q.2. Write a program using switch case which will display the option of all operators.

package Thursday_lab;
import java.util.*;
public class Operators {

	public static void main(String[] args) {
		int choice,num1,num2;
		char repeat;
		Scanner sc = new Scanner(System.in);		
		System.out.println("1:Arithmetic Operators\n2:Assingment Operators\n3:Bitwise Operators\n4:Logical Operators\n5:Relational Operators\n6:Ternary Operator");
		do
		{
			System.out.println("\nChoose the Operator: ");
			choice=sc.nextInt();
			switch(choice) 
			{
				case 1:
					
					System.out.println("\nYou Choosed Arithmetic Operators");
					System.out.println("Enter two numbers: ");
					num1=sc.nextInt();
					num2=sc.nextInt();
					int addition=num1+num2;
					int subtraction=num1-num2;
					int division=num1/num2;
					int multiplication=num1*num2;
					int modulus=num1%num2;
					System.out.println("Addition is: "+ addition);				//Addition Operator
					System.out.println("Subtraction is: "+ subtraction);		//Subtraction Operator
					System.out.println("Division is: "+ division);				//Division Operator
					System.out.println("Multiplication is: "+ multiplication);	//Multiplication Operator
					System.out.println("Modulus is: "+ modulus);				//Modulus Operator
					break;
					
				case 2:
					
					System.out.println("\nYou Choosed Assingment Operators");
					System.out.println("Enter the single number: ");
					num1=sc.nextInt();
					System.out.println("num1=10:"+(num1=10));				//Simple Assignment
					System.out.println("num1+=10:"+(num1+=10));				//Addition Assignment
					System.out.println("num1-=10:"+(num1-=10));				//Subtraction Assignment
					System.out.println("num1*=10:"+(num1*=10));				//Multiplication Assignment
					System.out.println("num1/=10:"+(num1/=10));				//Division Assignment
					System.out.println("num1%=10:"+(num1%=10));				//Modulus Assignment
					break;
					
				case 3:
					
					System.out.println("Your choice is Bitwise operators");
					System.out.println("\nEnter two numbers: ");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					System.out.println("Bitwise AND Assignment"+(num1&=num2));	//Bitwise AND operator
					System.out.println("Bitwise OR Assignment"+(num1|=num2));	//Bitwise OR operator
					System.out.println("Bitwise XOR Assignment"+(num1^=num2));	//Bitwise XOR operator
					break;
					
				case 4:
					
					System.out.println("Your choice is Logical operators");
					boolean a=true;
					boolean b=false;
					boolean result=a&&b;
					System.out.println("Result (Logical AND):"+result);			//Logical AND operator
					result=a||b;
					System.out.println("Result (Logical OR):"+result);			//Logical OR operator
					result=!a;
					System.out.println("Result (Logical NOT):"+result);			//Logical Not operator
					break;
					
				case 5:
					
					System.out.println("Your choice is Relational operators");
					int n1,n2;
					System.out.println("\nEnter two numbers: ");
					n1=sc.nextInt();
					n2=sc.nextInt();
					boolean num=(n1==n2);
					System.out.println("Result (Equals to):"+num);					//Equals to (==) Operator
					num=(n1!=n2);
					System.out.println("Result (Not equal to):"+num);				//Not Equals to (!=) Operator
					num=(n1>n2);
					System.out.println("Result (Greater than):"+num);				//Greater than (>) Operator
					num=(n1<n2);
					System.out.println("Result (Less than):"+num);					//Less than (<) Operator
					num=(n1>=n2);
					System.out.println("Result (Greater than or equal to):"+num);	//Greater than or Equals to (>=) Operator
					num=(n1<=n2);
					System.out.println("Result (Less than or equal to):"+num);		//Less than or Equals to (<=) Operator
					break;
					
				case 6:
				
					System.out.println("Your choice is Ternary operators");			//ternary Operator
					int x;
					System.out.println("\nEnter the number: ");
					x=sc.nextInt();
					String ans=(x%2==0)?"Even":"Odd";								//Even or Odd
			        System.out.println("Number "+x+" is "+ans);
					break;
				
				default:
				{
					System.out.println("invalid inpuit");
				}
			}
			System.out.println("\n\nDo you want to perform another operation...(y / n):");
			repeat = sc.next().charAt(0);
		}
		while(repeat == 'Y' || repeat == 'y');
	}

}
