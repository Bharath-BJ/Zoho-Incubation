package Evaluation1;
import java.util.*;
public class FormThreeDigitsNumbers {

	public static void main(String[] args) 
	{
		String str="1234";
		int count=0;
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				for(int k=0;k<str.length();k++)
				{
					if(i!=j && j!=k && i!=k)
					{
						count++;
						temp+=str.charAt(i);
						temp+=str.charAt(j);
						temp+=str.charAt(k);
						System.out.println(temp);
						temp="";
					}
				}
			}
		}
		System.out.println("No of three-digits numbers are "+count);
		
	}

}
