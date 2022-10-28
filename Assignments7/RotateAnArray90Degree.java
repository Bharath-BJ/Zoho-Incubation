package Assignments7;

import java.util.Scanner;

public class RotateAnArray90Degree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the No of rows ");
		int m=s.nextInt();
		System.out.println("Enter the No of columns");
		int n=s.nextInt();
		int[][] mat = new int[m][n];
		int arr[]=new int [m*n];
		int index=0;
		//Taking the matrix input
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter the matrix element at "+i+", "+j);
				mat[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
			
	}

}
