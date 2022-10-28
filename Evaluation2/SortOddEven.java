package Evaluation2;

import java.util.Scanner;

public class SortOddEven {
	private static void mergeSort(int[] a)
	{
		if(a.length<=1)
		{
			return;
		}
		int[] b = new int [a.length/2];
		int[] c = new int [a.length-b.length] ;
		for(int i=0;i<a.length/2;i++)
		{
			b[i]=a[i];
		}
		for(int j=a.length/2;j<a.length;j++)
		{
			c[j-a.length/2]=a[j];
		}
		mergeSort(b);
		mergeSort(c);
		merge(b,c,a);
	}
	private static void merge(int[]b,int[]c,int[] a)
	{
		
		int m=b.length,n=c.length;
		int i=0,j=0,k=0;
		while(i<m && j<n)
		{
			if(b[i]<c[j])
			{
				a[k]=b[i];
				i++;
				k++;
			}
			else
			{
				a[k]=c[j];
				j++;
				k++;
			}
		}
		while(i<m)
		{
			a[k]=b[i];
			i++;
			k++;
		}
		while(j<n)
		{
			a[k]=c[j];
			j++;
			k++;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		mergeSort(arr);
		int[] temp = new int[arr.length];
		int si=0,ei=n-1;
		int i=0;
		while(si<=ei)
		{
			temp[i++]=arr[si++];
			if(i<n)
				temp[i++]=arr[ei--];
		}
		for(int j=0;j<n;j++)
		{
			System.out.print(temp[j]+" ");
		}
	}

}
