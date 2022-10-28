package Assignments2;

import java.util.*;

/*9. Given 2 huge numbers as separate digits, store them in array and process them and calculate
	the sum of 2 numbers and store the result in an array and print the sum.
	Input: Number of digits:12
	9 2 8 1 3 5 6 7 3 1 1 6
	Number of digits:9
	7 8 4 6 2 1 9 9 7
	Output :  9 2 8 9 2 0 2 9 5 1 1 3                              */
public class sumOfTwoNumberUsingArray 
{
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
		int arr1[]= takeInput();
		int arr2[]= takeInput();
		int m=arr1.length,n=arr2.length;
		int outputLength=(m>n)? m+1 : n+1  ;
		int output[] = new int[outputLength];
		int i=m-1,j=n-1,k=outputLength-1;
		int rem=0;
		while(i>=0 && j>=0)
		{
			int sum = arr1[i] +arr2[j] + rem;
			rem =sum/10;
			output[k]=sum%10;
			i--;
			j--;
			k--;
		}
		while(i>=0)
		{
			output[k]= arr1[i]+rem;
			rem=0;
			i--;
			k--;
		}
		while(j>=0)
		{
			output[k]= arr2[j]+rem;
			rem=0;
			j--;
			k--;
		}
		for(int o:output)
		{
			System.out.print(o+" ");
		}
	}
}
