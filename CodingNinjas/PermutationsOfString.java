package CodingNinjas;

import java.util.Scanner;

public class PermutationsOfString {
	public static String[] permutations(String input)
	{
		if(input.length()==0)
	         return new String[1];
		if(input.length()==1)
		{
			String[] output=new String[1];
			output[0]=input;
			return output;
		}
		String[] smallOutput = permutations(input.substring(1));
		String[] output = new String[smallOutput.length*input.length()];
		int k=0;
		for(int i=0;i<smallOutput.length;i++)
		{
			String elem = smallOutput[i];
			for(int j=0;j<elem.length();j++)
			{
				output[k++]= elem.substring(0,j)+input.charAt(0)+elem.substring(j);
			}
			output[k++] = elem+input.charAt(0);
		}
	return output;
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String[] output=permutations(input);
		for(String i:output)
			System.out.println(i);

	}

}
