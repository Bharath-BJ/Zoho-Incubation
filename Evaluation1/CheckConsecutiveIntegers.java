package Evaluation1;
import java.util.*;
public class CheckConsecutiveIntegers {
	public static void merge(int[] arr1,int[] arr2,int[] arr)
	{
		int m=arr1.length,n=arr2.length;
		int i=0,j=0,k=0;
		while(i<m && j<n)
		{
			if(arr1[i]<arr2[j])
			{
				arr[k]=arr1[i];
				i++;
				k++;
			}
			else
			{
				arr[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<m)
		{
			arr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<n)
		{
			arr[k]=arr2[j];
			j++;
			k++;
		}
	}
	public static void mergeSort(int[] arr)
	{
		if(arr.length<=1)
		{
			return;
		}
		int[] arr1 = new int[arr.length/2];
		int[] arr2 = new int[arr.length-arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=arr[i];
		}
		for(int j=arr.length/2;j<arr.length;j++)
		{
			arr2[j-arr.length/2]=arr[j];
		}
		mergeSort(arr1);
		mergeSort(arr2);
		merge(arr1,arr2,arr);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the element at "+i+" index");
			arr[i]=s.nextInt();
		}
		mergeSort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1]-arr[i]!=1)
			{
				System.out.println("The Array does not contains consecutive integers as element "+arr[i]+" is repeated ");
				return;
			}
		}
		System.out.println("The Array contains consecutive integers from "+arr[0]+" to "+arr[arr.length-1]);
	}

}
