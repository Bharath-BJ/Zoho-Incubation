package Assignments8;

import java.util.Arrays;
import java.util.Scanner;

public class WaterTrappedBetweenTheBlocks {
	public static int bestApproach(int[] arr)
	{
		int n=arr.length;
		int boundary = arr[0]<arr[n-1]? arr[0] : arr[n-1]; // Finding the shorter boundary
		int waterTrapped = 0;
		for(int i=1;i<n-1;i++) // Excluding the boundaries
		{
			if(arr[i]<boundary)
				waterTrapped+=boundary-arr[i];
		}
	return waterTrapped;
	}
	public static void main(String[] args) {
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
		System.out.println(bestApproach(arr));
		
	}

}
