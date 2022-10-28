package Assignments2;

import java.util.*;

/*2. Given an array of integers of size n. Convert the array in such a way that if next valid number is
same as current number, double its value and replace the next number with 0. After the
modification, rearrange the array such that all 0’s are shifted to the end.
Input : arr[] = {2, 2, 0, 4, 0, 8}      Output : 4 4 8 0 0 0
Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}        Output : 4 2 12 8 0 0 0 0 0 0      */
public class arrayModification {
	private static int[] takeInput()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
	return arr;
	}
	public static void main(String[] args) 
	{
		int[] arr = takeInput();
		for(int i=0;i<arr.length-2;i++) // Array Modification 
		{
			if(arr[i]==arr[i+1])
			{
				arr[i]=2*arr[i];
				arr[i+1]=0;
			}
		}	
		int i=0,start=0;
		while(i<arr.length)    // Moving zeros to the end
		{
			if(arr[i]!=0)
			{
				int temp = arr[i];
				arr[i]=arr[start];
				arr[start]=temp;
				start++;
			}
			i++;
		}
		for(int j:arr)
		{
			System.out.print(j+" ");
		}

	}

}
