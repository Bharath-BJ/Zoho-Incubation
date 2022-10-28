package Assignments4;
import java.util.Scanner;

public class CompoundInterest {
	private static double CI(int P,double R,int T)
	{
		double ci;
		ci=P*Math.pow(1+R/100,T);
		System.out.println(P+" "+R+" "+T);
	return ci;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int P=s.nextInt(),T=s.nextInt();
		double R=s.nextDouble();
		int compoundRate;
		switch(compoundRate=s.nextInt())
		{
			case 1: // Monthly
				R=R/12;
				T=T*12;
				System.out.println(CI(P,R,T));
				break;
			case 2:  //Quarterly
				R=R/4;
				T=T*4;
				System.out.println(CI(P,R,T));
				break;
			case 3:  //Half-yearly
				R=R/2;
				T=T*2;
				System.out.println(CI(P,R,T));
				break;
			default:
				System.out.println(CI(P,R,T));
		}

	}

}
