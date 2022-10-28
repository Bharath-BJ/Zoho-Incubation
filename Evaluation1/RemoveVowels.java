package Evaluation1;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String input ");
		String str = "compuuter";
		String temp="";
		int i=0;
		while(i<str.length()-1)
		{
			char c1=str.charAt(i),c2=str.charAt(i+1);
			if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u' )
			{
//				System.out.println(c1+" "+c2);
				if(c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u')
				{
				temp+=c1;
				temp+=c2;
				i+=2;
				continue;
				}
			}
			if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u' )
			{
//				System.out.println(c1);
				i++;
				continue;
			}
			temp+=c1;
			i++;
		}
		temp+=str.charAt(str.length()-1);
		System.out.println(temp);
	}

}
