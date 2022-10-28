package CodingNinjas;
import java.util.*;
public class keypadPossibleStrings {
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
		String[] possibleStrings = keypad(n);
		for(String i:possibleStrings)
		{
			System.out.println(i);
		}
	}

}
