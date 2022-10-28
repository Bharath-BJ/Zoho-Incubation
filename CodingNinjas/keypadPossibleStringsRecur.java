package CodingNinjas;

import java.util.Scanner;

public class keypadPossibleStringsRecur {
	public static void printKeypad(int input){
		helper(input,"");
	}
    private static void helper(int input,String stringSoFar)
    {
        if(input==0)
        {
            System.out.println(stringSoFar);
			return;
        }
        String numsKey[]={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int smallOutput=input/10;
        String lastDigitString=numsKey[input%10-1];
        for(int i=0;i<lastDigitString.length();i++)
        {
            helper(smallOutput,lastDigitString.charAt(i)+stringSoFar);
        }
    }
    public static String[] keypad(int n){
		if(n==0 || n==1)
        {
            String[] possibleStrings=new String[1];
            possibleStrings[0]="";
            return possibleStrings;
        }
        String numsKey[]={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String[] smallOutput=keypad(n/10);
        String lastNumString=numsKey[n%10-1];
        String[] possibleStrings=new String[smallOutput.length*lastNumString.length()];
//        System.out.println(possibleStrings.length);
        int k=0;
        for(int i=0;i<smallOutput.length;i++)
        {
            String str=smallOutput[i];
            for(int j=0;j<lastNumString.length();j++)
            {
                char ch=lastNumString.charAt(j);
                possibleStrings[k++]=str+""+ch;
            }
        }
    return possibleStrings;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		printKeypad(n);
//		String[] output=keypad(n);
//		for(String i:output)
//		{
//			System.out.println(i);
//		}

	}

}
