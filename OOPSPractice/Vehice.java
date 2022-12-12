package OOPSPractice;

public class Vehice {

	public static void main(String[] args) {
		char c='\u0000';
		System.out.println(c);
		char[][] s=new char[1][4];
		s[0][3]='g';
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
				System.out.print(s[i][j]);
			}
			System.out.println();
		}
	}

}
