package Assignments8;

import java.util.Scanner;

public class LongestSubArrayToK {
	public static int naiveApproach(int[]arr,int k)
	{
		int n=arr.length;
		int maxLength=0;
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i;j<n;j++)
			{
				sum+=arr[j];
				if(sum==k)
					maxLength=j-i+1;
			}
		}
	return maxLength;
	}
	public static int bestApproach(int[]arr,int k)
	{
		return 0;
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
		System.out.println("Enter the sum to find the longest subArray");
		int k=s.nextInt();
		System.out.println(naiveApproach(arr,k));
		

	}

}
