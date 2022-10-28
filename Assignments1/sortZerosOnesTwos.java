package Assignments1;

import java.util.*;

/*Given an array of size N containing only 0s, 1s, and 2s; sort the array in
ascending order.
Example 1:
Input:
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Example 2:
Input:
N = 3
arr[] = {0 1 0}
Output:
0 0 1    */
public class sortZerosOnesTwos {
	static Scanner s  = new Scanner (System.in);
	public static int[] takeInput()
	{
		System.out.println("Enter the size of the array");
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the array element at index "+i);
			arr[i]=s.nextInt();
			if(arr[i]<0 || arr[i]>2)
			{
				System.out.println("Enter number between 0 and 2");
				i--;
			}
		}	
	return arr;
	}

	public static void main(String[] args) 
	{
		int[] arr = takeInput();
		int i=0,start =0,end = arr.length-1;
        while(i<arr.length)
        {
            if(arr[i]==0 && i>start)
            {
                int temp =arr[start];
                arr[start]= arr[i];
                arr[i]=temp;

                start++;
            }
            else if(arr[i]==2 && i<end)
            {
                int temp = arr[end];
                arr[end]= arr[i];
                arr[i]=temp;
                end--;
            }
            else 
                i++;
        }
        for(int j=0;j<arr.length;j++)
    		{
    			System.out.print(arr[j]+" ");
    		}
	}

}
