package Assignments3;
import java.util.*;

/*5) Given a string s and an integer k, return the length of the longest substring ofssuch that the
	frequency of each character in this substring is greater than or equal tok.
	Input: s = "aaabb", k = 3
	Output: 3
	Explanation: The longest substring is "aaa", as 'a' is repeated 3 times.
	Input: s = "ababbc", k = 2
	Output: 5
	Explanation: The longest substring is "ababb", as 'a' is repeated 2
	times and 'b' is repeated 3 times        */
public class freqOfCharGreaterThanK {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = "ababbc";
		int k=2;
		String output="";
		int count=Integer.MIN_VALUE;
		for(int i=0;i<str.length();i++)
		{
			int count1=freqArrayCount(str.substring(0,str.length()-i),k);
			if(count1>count)
			{
				count=count1;
				output="";
				output+=str.substring(0,str.length()-i);
			}
//			System.out.println(str.substring(0,str.length()-i));
		}
		for(int i=0;i<str.length();i++)
		{
			int count2=freqArrayCount(str.substring(i,str.length()),k);
			if(count2>count)
			{
				count=count2;
				output="";
				output+=str.substring(i,str.length());
			}
//			System.out.println(str.substring(i,str.length()));
		}
		System.out.println("Largest substring is "+output+" and it's count is "+count);
	}
	private static int freqArrayCount(String str,int k)
	{
		int[]arr=new int[26];
		for(int i=0;i<str.length();i++)
		{
			int ch = str.charAt(i);
			if(ch>=65 && ch<=90)
			{
				ch=ch-65;
			}
			if(ch>=97 && ch<=122)
			{
				ch=ch-97;
			}
			arr[ch]++;
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<k && arr[i]!=0)
			{
				return 0;
			}
			count+=arr[i];
		}
	return count;
	}
}
