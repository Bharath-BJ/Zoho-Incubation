package MatrixPractice;

import java.util.*;

public class TransposeAMatrix {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
	int m=mat.length,n=mat[0].length;
	
	for(int i=0;i<m;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			int temp = mat[i][j];
			mat[i][j]= mat[j][i];
			mat[j][i]=temp;
		}
	}
	
	//Print the matrix
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
