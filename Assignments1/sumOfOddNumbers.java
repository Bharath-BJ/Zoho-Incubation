package Assignments1;

import java.util.*;

/*Write a program in Java to display the n terms of odd natural number
and their sum.
Input number of terms is: 5
Expected Output :
The odd numbers are :
1
3
5
7
9
The Sum of odd Natural Number up to 5 terms is: 25*/
public class sumOfOddNumbers {

	public static void main(String[] args) 
	{
		Scanner s  = new Scanner (System.in);
		System.out.println("Enter the input: ");
		int input = s.nextInt();
		int sum=0;
		System.out.println("Odd numbers are ");
		for(int i=1;i<=2*input;i+=2)
		{
			System.out.println(i);
			sum+=i;
		}
		System.out.println("Sum of the Odd Natural Numbers are: "+sum);

	}

}
