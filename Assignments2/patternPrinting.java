package Assignments2;
import java.util.*;
public class patternPrinting {
/*	6. Print the following pattern
	       1
	      3 2
	     6 5 4
	    10 9 8 7
     	10 9 8 7
         6 5 4
	      3 2
	       1                      */
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n =4;
		for(int i=0;i<n;i++)
		{
			int num=i+1;
			int num1=num*(num+1)/2;
			for(int j=0;j<n-1-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<2*i+1;j++)
			{
				if(j%2==1)
				{
					System.out.print(" ");
					continue;
				}
				System.out.print(num1--);
				
			}
			System.out.println();	
		}
		int num2=n*(n+1)/2;
		 for(int i=0;i<n;i++) 
		 { 
			 for(int j=0;j<i;j++) 
			 { 
				 System.out.print(" "); 
			 }
			 
			 for(int j=0;j<2*n-2*i;j++) 
			 { 
				 if(j%2==1) 
				 { System.out.print(" ");
				 continue; 
				 }
				 System.out.print(num2--); 
			 } 
			 System.out.println();
		 
		 }
		 

	}

}
