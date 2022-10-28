package Assignments4;
import java.util.*;
public class Holiday 
{
	String name;
	int date;
	String month;
	public Holiday(String name,int date,String month)
	{
		this.name=name;
		this.date=date;
		this.month=month;
	}
	public boolean sameMonth(Holiday h)
	{
		return this.month==h.month;
	}
	public double avgDate(Holiday[] arr)
	{
		int sum=this.date;
		for(int i=1;i<arr.length;i++)
		{
			sum+=arr[i].date;
		}
		double avg=sum/arr.length;
	return avg;
	}
	public void createHoliday(String name,int date,String month)
	{
		Holiday h=new Holiday(name,date,month);
		System.out.println(h.name+" "+h.date+" "+h.month);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Holiday h1=new Holiday("Independence day",15,"August");
		Holiday h2=new Holiday("Republic day",26,"January");
		Holiday h3=new Holiday("Worker's day",5,"May");
		Holiday h4=new Holiday("Diwali day",22,"October");
		Holiday h5=new Holiday("Gandhi jayanti",2,"October");
		Holiday h6=new Holiday("Christmas",25,"December");
		Holiday h7=new Holiday("Teacher",5,"September");
		System.out.println(h7.sameMonth(h5));
		Holiday[] arr=new Holiday[3];
		for(int i=0;i<arr.length;i++)
		{
			String name=s.next();
			int date=s.nextInt();
			String month=s.next();
			Holiday h=new Holiday(name,date,month);
			arr[i]=h;
		}
		System.out.println(arr[0].avgDate(arr));
		String name=s.next();
		int date=s.nextInt();
		String month=s.next();
		h1.createHoliday(name,date,month);
	}

}
