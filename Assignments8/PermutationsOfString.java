package Assignments8;

import java.util.Scanner;

public class PermutationsOfString {
	public static String[] permutations(String str)
	{
		if(str.length()==0)
		{
			String[] output=new String[1];
			output[0]="";
			return output;
		}
		int len=fact(str.length());
		String[] output = new String[len];
		String[] smallOutput = permutations(str.substring(1));
		int x=0;
		for(int i=0;i<smallOutput.length;i++)
		{
			for(int j=0;j<smallOutput[i].length();j++)
			{
				String elem ="";
				for(int k=0;k<j;k++)
				{
					elem+=str.charAt(k); 
				}
				elem+=str.charAt(0);
				for(int k=j;k<smallOutput[i].length();k++)
				{
					elem+=str.charAt(k); 
				}
				output[x++]=elem;
			}
		}
	return output;
	}
	public static int fact(int n)
	{
		if(n==0 || n==1)
			return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String[] output=permutations(str);
		for(String i:output)
			System.out.println(i);

	}

}
