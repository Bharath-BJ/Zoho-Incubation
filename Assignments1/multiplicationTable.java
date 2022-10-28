package Assignments1;

import java.util.*;
//    Write a Java program that takes a number as input and prints its
//    multiplication table up to 10
public class multiplicationTable {

	public static void main(String[] args) 
	{
		Scanner s  = new Scanner (System.in);
		System.out.println("Enter the number");
		int input = s.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(input+" * "+i+" = "+input*i );
		}

	}

}
