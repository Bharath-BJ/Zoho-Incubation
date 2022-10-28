package CodingNinjas;
import java.util.*;
public class palindromePair {
	public static boolean isPalindromePair(ArrayList<String> words) 
	{
		for(int i=0;i<words.size();i++)
		{
			for(int j=0;j<words.size();i++)
			{
				String str=words.get(i)+words.get(j);
				if(isPalindrome(str))
					return true;
			}
		}
	return false;
	}
	public static boolean isPalindrome(String str)
	{
		int si=0,ei=str.length()-1;
		while(si<ei)
		{
			if(str.charAt(si)!=str.charAt(ei))
			{
				return false;
			}
		}
	return true;
	}
	public static String reverseString(String str)
	{
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			temp=str.charAt(i)+temp;
		}
	return temp;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<>();
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			arr.add(s.next());
		}
		System.out.println(isPalindromePair(arr));
	}

}
