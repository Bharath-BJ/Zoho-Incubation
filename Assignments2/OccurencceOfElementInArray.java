package Assignments2;

import java.util.Scanner;
/*8. Given an array of positive integers. The output should be the number of occurrences of each number.
Example:
Input: {2, 3, 2, 6, 1, 6, 2}
Output:
1 – 1
2 – 3
3 – 1
6 – 2                              */
public class OccurencceOfElementInArray 
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
		int[] arr = {2,3,2,6,1,6,2};
		
		int t=0;
		while(t<arr.length)
		{
			int min=Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<min)
				{
					min=arr[i];
				}
			}
			if(min==Integer.MAX_VALUE)
			{
				break;
			}
			int count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==min)
				{
					count++;
				}
			}
			System.out.println(min+"-"+count);
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==min)
				{
					arr[i]=Integer.MAX_VALUE;
				}
			}
		}
		t++;
	}

}
