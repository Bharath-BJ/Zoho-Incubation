package Assignments8;

import java.util.Scanner;

public class GreaterThanPreviousElementInArray 
{
	public static void naiveApproach(int[] arr)
	{
		System.out.print(arr[0]+" ");
		for(int i=1;i<arr.length;i++)
		{
			boolean flag=true;
			for(int j=i-1;j>=0;j--)
			{
				if(arr[i]<arr[j]) 
				{
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void bestApproach(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				System.out.print(max+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = s.nextInt();
		int arr[] = new int[n];
		// Taking the input from user
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element at index "+i);
			arr[i]=s.nextInt();
		}
		naiveApproach(arr);
		bestApproach(arr);
		
	}
}
