package Assignments3;
import java.util.*;
/*1) Strings Repetition
		You just need to take a string and a integer as an input and repeat the string upto the count given
		as in integer.
		Sample Test Case :
		Hello
		2
		Output : HelloHello                           */
public class stringRepetition {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int count=s.nextInt();
		for(int i=0;i<count;i++)
		{
			System.out.print(str);
		}
	}

}
