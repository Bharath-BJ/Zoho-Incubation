package Assignments1;

import java.util.*;

/*Given an array A of size N of integers. Your task is to find the minimum
and maximum elements in the array.
Example 1:
Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max = 10000
Example 2:
Input:
N = 5
A[] = {1, 345, 234, 21, 56789}
Output:
min = 1, max = 56789         */
public class minMaxInArray {

	public static void main(String[] args) {
		Scanner s  = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the array element at index "+i);
			arr[i]=s.nextInt();
		}
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("Minimum element in the array is "+min);
		System.out.println("Maximum element in the array is "+max);
	}

}
