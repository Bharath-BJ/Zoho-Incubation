package CodingNinjas;

import java.util.Scanner;

public class SubsequencesofString {
	public static String[] subsequence(String str)
	{
		if(str.length()==0)
		{
			String[] output=new String[1];
			output[0]="";
			return output;
		}
		int len = (int) Math.pow(2, str.length());
		String[] output = new String[len];
		String[] smallOutput= subsequence(str.substring(1));
		int k=0;
		for(int i=0;i<smallOutput.length;i++)
		{
			output[k++]=smallOutput[i];
		}
		for(int i=0;i<smallOutput.length;i++)
		{
			output[k++]=str.charAt(0)+smallOutput[i];
		}
	return output;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String[] output=subsequence(str);
		for(String i:output)
			System.out.println(i);
		
	}

}
