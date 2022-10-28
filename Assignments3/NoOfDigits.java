package Assignments3;

public class NoOfDigits {

	public static void main(String[] args) {
		int num=469757;
		int figure=num;
		int digits=0;
		while(num!=0)
		{
			digits++;
			num/=10;
		}
		figure=(int)(figure/Math.pow(10, digits-2));
		System.out.println(figure);
		System.out.println(figure%10);
	}

}
