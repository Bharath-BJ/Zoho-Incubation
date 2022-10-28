package Assignments8;

import java.util.Arrays;
import java.util.Scanner;

public class ElementMissingInTheRange {
	public static int naiveApproach(int[] arr)
	{
		int n=arr.length;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1]-arr[i]!=1)
				return arr[i]+1;
		}
	return -1;
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
		System.out.println(naiveApproach(arr));
	}

}
