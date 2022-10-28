package Assignments1;

import java.util.*;

/*Given an unsorted array arr[] of size N having both negative and positive
integers. The task is place all negative element at the end of array without
changing the order of positive element and negative element.
Example 1:
Input :
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output :
1  3  2  11  6  -1  -7  -5
Example 2:
Input :
N=8
arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
Output :
7  9  10  11  -5  -3  -4  -1 */
public class sortPositiveNegative 
{
	static Scanner s  = new Scanner (System.in);
	private static int[] takeInput()
	{
		System.out.println("Enter the ");
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
	return arr;	
	}
	private static void print(int[] arr)
	{
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		for(int i=0;i<arr1.length-1;i++)  // Method 1 --> time complexity is O(n^2)
		{
			for(int j=0;j<arr1.length-1-i;j++)
			{
				if(arr1[j]<0 && arr1[j+1]>0)
				{
					int temp = arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
				}
			}
		}
		
		int i=0,start=0;
		while(i<arr2.length)     // Method 2 --> time complexity is O(n)
		{
			if(arr2[i]>0)
			{
				int temp = arr2[i];
				arr2[i]=arr2[start];
				arr2[start]=temp;
				start++;
			}
		i++;
		}
		print(arr1);
		print(arr2);
	}

}
