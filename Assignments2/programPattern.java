package Assignments2;
/* 7. Given an odd length word which should be printed from the middle of the word.
The output should be in the following pattern.
Example:
Input: PROGRAM
Output:
            G
          GR
        GRA
      GRAM
    GRAMP
  GRAMPR
GRAMPRO                                                  */
public class programPattern {

	public static void main(String[] args) 
	{
		String str="PROGRAM";
		int n=str.length();
		for(int i=0;i<n;i++)  // Method 1 Peers way to find no of spaces was easy using the double spacing 
		{
			for(int j=1;j<n-i;j++)
			{
				System.out.print("  ");
			}
			int print=n/2;
			for(int j=0;j<i+1;j++)
			{
				System.out.print(str.charAt((print++)%n));
			}
			System.out.println();
		}
		
		
		for(int i=0;i<n;i++)  // Method 2 My way to find no of spaces was little complicated
		{
			int spaces=0;
			spaces = (i<n/2-1)?   2*n-2*i   :   2*n-2*i-1;
			if(i==n-1)
			{
				spaces=2*n-2*i-2;
			}
			for(int j=0;j<spaces;j++)
			{
				System.out.print(" ");
			}
			int print=n/2;
			for(int j=0;j<i+1;j++)
			{
				System.out.print(str.charAt((print++)%n));
			}
			System.out.println();
		}
												

	}

}