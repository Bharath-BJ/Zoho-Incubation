package Assignments1;

import java.util.*;
/*     Write a Java program that reads a floating-point number and prints
"zero" if the number is zero. Otherwise, print "positive" or "negative". Add
"small" if the absolute value of the number is less than 1, or "large" if it
exceeds 1,000,000.
                                                                   */
public class greaterOrLess {

	public static void main(String[] args) 
	{
		Scanner s  = new Scanner (System.in);
		System.out.println("Enter the input : ");
		float input = s.nextFloat();
		if(input>0)
		{
			if(input<1)
			{
				System.out.print("small ");
			}
			if(input>1000000)
			{
				System.out.print("Large ");
			}
			System.out.println("Positive");
		}
		else if(input<0)
		{
			if(-input<1)
			{
				System.out.print("small ");
			}
			if(-input>1000000)
			{
				System.out.print("Large ");
			}
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
	}

}
