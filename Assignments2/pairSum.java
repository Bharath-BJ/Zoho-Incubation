package Assignments2;
import java.util.*;
/*4.Given an array A[] and a number x, check for pair in A[] with sum as x.
	Eg : Input {1, 2, 4, 3, 5, 6}
	SUM : 5 Output : 2 (1, 4) & (2, 3)*/

public class pairSum {
	static Scanner s = new Scanner(System.in);
	private static int[] takeInput()
	{
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
		int x= s.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j] == x)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}

}
