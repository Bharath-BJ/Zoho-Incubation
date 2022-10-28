package Assignments8;

import java.util.*;

public class ExtraElementFromSortedArrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array1:");
		int m = s.nextInt();
		int arr1[] = new int[m];
		for(int i=0;i<m;i++)
		{
			System.out.println("Enter the element at index "+i);
			arr1[i]=s.nextInt();
		}
		System.out.println("Enter the size of the array2:");
		int n = s.nextInt();
		int arr2[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element at index "+i);
			arr2[i]=s.nextInt();
		}
		
		
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]!=arr2[j])
			{
//				index = i; 
				System.out.println(i);
				break;
			}
			i++;
			j++;
		}

	}

}
