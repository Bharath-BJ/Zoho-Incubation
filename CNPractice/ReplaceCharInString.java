package CNPractice;
import java.util.*;
public class ReplaceCharInString 
{
	public static String replaceCharInString (String str,char x,char y)
	{
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==x)
			{
				temp+=y;
				continue;
			}
			temp+=str.charAt(i);
		}
	return temp;
	}
	public static String replaceCharInStringRecur (String str,char x,char y)
	{
		if(str.length()==0)
		{
			return str;
		}
		String smallOutput=replaceCharInStringRecur(str.substring(1),x,y);
		if(str.charAt(0)==x)
			return  y+smallOutput;
		else
			return str.charAt(0)+smallOutput;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String str= s.next();
		char x= s.next().charAt(0),y=s.next().charAt(0);
//		System.out.println(replaceCharInString(str,x,y));
		System.out.println(replaceCharInStringRecur(str,x,y));
	}
}
