package Assignments1;

import java.util.*;

/* Two numbers are entered through the keyboard. Write a program to find
the value of one number raised to the power of another. (Do not use Java builtin method).*/
public class powerOfNumber {

	public static void main(String[] args) 
	{
		Scanner s  = new Scanner (System.in);
		System.out.println("Enter the value of x:");
		int x = s.nextInt();
		System.out.println("Enter the value of y:");
		int y  = s.nextInt();
		System.out.println(power(x,y));
	}
	private static double power(int x,int y)
	{
		if(y==0)
		{
			return 1;
		}
		if(y>0)
		{
			return x*power(x,y-1);
		}
	return power(x,y+1)/x;
	}

}
