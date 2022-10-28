package Evaluation1;

import java.util.Scanner;

public class NumbersPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input");
		int n = 4;
		int value1=1;
		for(int i=0;i<n;i++)
		{
			int print1=value1+i;
			for(int j=0;j<2*i+1;j++)
			{
				if(j%2==1)
				{
					System.out.print("*");
					continue;
				}
				System.out.print(print1++);
			}
			value1+=i;
			System.out.println();
		}
		int value2 =2*n-1;
		for(int i=0;i<n;i++)
		{
			int print2 = value2;
			for(int j=0;j<2*n-2*i-1;j++)
			{
				if(j%2==1)
				{
					System.out.print("*");
					continue;
				}
				System.out.print(print2++);
			}
			value2=value2-(n-1)+i;
			System.out.println();
		}
	}

}
