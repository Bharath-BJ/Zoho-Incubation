package Evaluation1;

import java.util.Scanner;

public class covidCases {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the element at "+i+" index");
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the no of treatment days");
		int k=s.nextInt();
		int sum=0;
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(i>=k)
			{
				sum-=arr[j++];
			}
		}
		System.out.println(sum);
	}

}
