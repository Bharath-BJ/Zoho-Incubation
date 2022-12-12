package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basics {

	public static void main(String[] args) {
		String sentence="aabbabababbabbbbabaaaaabaa";
		Pattern p = Pattern.compile("a{2,3}");
		Matcher m = p.matcher(sentence);
		int count=0;
		while(m.find())
		{
//			count++;
			System.out.println(m.group()+" starts at "+m.start());
		}
//		System.out.println("'is' word appears "+ count+" times");
	}

}
