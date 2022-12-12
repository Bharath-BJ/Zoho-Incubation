package MatrixPractice;

import java.util.Scanner;

public class PrintMatrixInDiagonalOrder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [][] mat ={
	            { 1, 2, 3, 4 },     { 5, 6, 7, 8 },
	            { 9, 10, 11, 12 },  { 13, 14, 15, 16 },
	            { 17, 18, 19, 20 },
	        };
		int m=mat.length,n=mat[0].length;
		/*
		 	1     2     3     4 
		    5     6     7     8 
		    9    10    11    12 
		   13    14    15    16 
		   17    18    19    20 

		Diagonal printing of matrix is 
		    1 
		    5     2 
		    9     6     3 
		   13    10     7     4 
		   17    14    11     8 
		   18    15    12 
		   19    16 
		   20  
		 */
		
		for(int i=0;i<m;i++)
		{
			int x=i;
			for(int j=0;j<n && x>=0;j++)  // Here condition is important
			{
				System.out.print(mat[x--][j]+" ");
			}
			System.out.println();
		}
		
		for(int j=1;j<n;j++)
		{
			int x=m-1;
			int y=j;
			while(y<n)
			{
			System.out.print(mat[x--][y++]+" ");
			}
			System.out.println();
		}	
			


	}

}
