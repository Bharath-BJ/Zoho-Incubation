package CodingNinjas;

import java.util.Arrays;

public class mergeSort {

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
		int[] a= {3,5,7,9,12,6,3};
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	}

}
