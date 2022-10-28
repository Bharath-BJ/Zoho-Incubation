package RailwayTicketReservation;

public class Passenger 
{
	int SNO;
	String name;
	int age;
	char gender;
	String berthPerference;
	int pnr;
	public Passenger(int SNO,String name,int age,char gender,String berthPerference,int pnr)
	{
		this.SNO=SNO;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.berthPerference=berthPerference;
		this.pnr=pnr;
	}
}
