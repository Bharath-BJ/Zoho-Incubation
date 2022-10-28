package Assignments1;

import java.util.*;
//    Write a Java program to swap two variables
public class swapVariables {

	public static void main(String[] args) 
	{
		Scanner s  = new Scanner (System.in);
		System.out.println("Enter the first number");
		int x = s.nextInt();
		System.out.println("Enter the second number");
		int y  = s.nextInt();
		// without using third variables
		System.out.println("Solution without using third variable");
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.print(x+" ");
		System.out.println(y);
		// using third variable
		System.out.println("Solution using third variable");
		int temp = x;
		x=y;
		y=temp;
		System.out.print(x+" ");
		System.out.println(y);

	}

}
