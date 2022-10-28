package Assignments8;

import java.util.Scanner;

public class MedianOfTwoSortedArrays {
	public static double naiveApproach(int[] arr1,int[] arr2)
	{
		int m=arr1.length,n=arr2.length;
		int arr[]=new int [m+n];
		int i=0,j=0,k=0;
		while(i<m && j<n)
		{
			if(arr1[i]<arr2[j])
			{
				arr[k]=arr1[i];
				k++;
				i++;
			}
			else
			{
				arr[k]=arr2[j];
				k++;
				j++;
			}
		}
		while(i<m)
		{
			arr[k]=arr1[i];
			k++;
			i++;
		}
		while(j<n)
		{
			arr[k]=arr2[j];
			k++;
			j++;
		}
		
		int o=arr.length;
		double median;
		if(o%2==1)
		{
			median = arr[o/2];
			return median;
		}
		else
		{
			median = ((double)arr[o/2-1] + arr[o/2])/2;
			return median;
		}
	}
	public static double bestApproach(int[] arr1,int[] arr2)
	{
		int m=arr1.length,n=arr2.length;
		int i=0,j=0;
		while(i<(m+n)/2 && j<(m+n)/2)
		{
			if(arr1[i]<arr2[j])
				i++;
			else
				j++;
		}
//		System.out.println(arr1[i]+" "+arr2[j]);
		
		double median;
		if((m+n)%2==1)
		{
			median= (arr1[i]<arr2[j])? arr1[i] : arr2[j];
			return median;
		}
		else
		{
			median = ((double)arr1[i]+arr2[j])/2;
			return median;
		}
	}
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
		System.out.println(naiveApproach(arr1,arr2));
		System.out.println(bestApproach(arr1,arr2));
		
		
		
		
		
		

	}

}
