package Assignments8;

import java.util.Scanner;

public class TwoArraysRepresentSameString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array1:");
		int m = s.nextInt();
		String arr1[] = new String[m];
		for(int i=0;i<m;i++)
		{
			System.out.println("Enter the element at index "+i);
			arr1[i]=s.next();
		}
		System.out.println("Enter the size of the array2:");
		int n = s.nextInt();
		String arr2[] = new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element at index "+i);
			arr2[i]=s.next();
		}
		
		
		String str1="",str2="";
		for(int i=0,j=0;i<arr1.length && j<arr2.length;i++,j++)
		{
			str1+=arr1[i];
			str2+=arr2[j];
		}
		if(str1.equals(str2))
			System.out.println(true);
		else
			System.out.println(false);
			
	}

}
