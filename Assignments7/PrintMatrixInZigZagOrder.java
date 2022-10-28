package Assignments7;

import java.util.Scanner;
/*
1	2	3	4	5 
6	7	8	9	10
11	12	13	14	15
16	17	18	19	20
21	22	23	24	25

ZigZag printing of matrix is 
   1 
   2     6 
  11     7     3 
   4     8    12    16 
  21    17    13     9 	5  
  10    14    18	 22  
  23    19	   15 
  20	 24
  25  
		 */
public class PrintMatrixInZigZagOrder {

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
			if(i%2==0) // Check whether index is even or odd
			{
				int x=i;
				int y=0;
				for(int j=0;j<n && x>=0;j++)
				{
//					System.out.print(mat[x--][y++]+" ");
					arr[index++]=mat[x--][y++];
				}
			}
			if(i%2==1)
			{
				int x=0;
				int y=i;
				for(int j=0;j<n && x<=i;j++)
				{
					
//					System.out.print(mat[x++][y--]+" ");
					arr[index++]=mat[x++][y--];
				}
			}
			System.out.println();
		}
		for(int i=1;i<m;i++)
		{
			if(i%2==1)
			{
				int x=i;
				int y=n-1;
				while(x<m) {
//					System.out.print(mat[x++][y--]+" ");
					arr[index++]=mat[x++][y--];
				}	
			}
			if(i%2==0)
			{
				int x=n-1;
				int y=i;
				while(y<n) {
//					System.out.print(mat[x--][y++]+" ");
					arr[index++]=mat[x--][y++];
				}
			}
			System.out.println();
		}
		
		for(int i:arr)
			System.out.print(i+" ");
	}

}
