package RailwayTicketReservation;
import java.util.*;
public class BookingProcess 
{
	static int LB=0;
	static int MB=1;
	static int UB=1;
	static int RAC=2;
	static int WL=2;
	static int pnr=0;
	static int SNO=0;
	static int ticketCount=0;
	static int ticketsLeft=LB+MB+UB;  // Variable created to customize the view availability depending on the ticketsLeft
	static int totalAvailableTickets=LB+MB+UB+RAC+WL;
	static Passenger[]  Tickets=new Passenger[20];
	public static void viewAvailability()
	{
		if(ticketsLeft==0)
		{
			ticketsLeft=RAC;
		}
		if(ticketsLeft==0)
		{
			ticketsLeft=WL;
		}
		System.out.println("Total available tickets are "+ticketsLeft);
		System.out.println("LB -"+LB);
		System.out.println("MB -"+MB);
		System.out.println("UB -"+UB);
		if(LB+MB+UB==0)
		{
			System.out.println("RAC -"+RAC);
		}
		if(LB+MB+UB+RAC==0)
		{
			System.out.println("WL -"+WL);
		}
	}
	public static void booking()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of tickets to be booked");
		int n=s.nextInt();
		if(n>totalAvailableTickets)
		{
			if(totalAvailableTickets!=0)
			{
				System.out.println("Only "+totalAvailableTickets+" seats are available");
				System.out.println("Enter 'yes' to book available tickets or 'no' to quit ");
				String condition=s.next();
				if(condition.equals("yes"))
				{
					booking();
				}
			}
			else
			{
				System.out.println("Sorry No seats are available ");
			}
		}
		else
		{
			pnr++;
			for(int i=ticketCount;i<n+ticketCount;i++)
			{
				
				s.nextLine();
				String BP="NA";
				System.out.println("Enter your name");
				String name=s.nextLine();
				System.out.println("Enter your age");
				int age=s.nextInt();
				System.out.println("Enter your gender in single letter: M for Male or F for Female");
				char gender=s.next().charAt(0);
				if(age>5)
				{
					System.out.println("Enter your berth perference"
					         + " LB for Lower Berth"
					         + " MB for Middle Berth"
					         + " UB for Upper Berth");
					BP=s.next();
				}
				SNO++;
				Passenger Ticket=new Passenger(SNO,name,age,gender,BP,pnr);
				Tickets[i]=Ticket;
				System.out.println();
				if(age>=60 && LB!=0)
				{
					Ticket.berthPerference="LB";
					LB--;
					ticketsLeft--;
					totalAvailableTickets--;
					System.out.println("Lower Berth allotted");
					System.out.println("Ticket booked Successfully ");
					System.out.println("---------------------------------------------");
					continue;
			
				}
				if(age<=5)
				{
					SNO--; // To nullify the regular increment of SNO
					Ticket.SNO=0;
					System.out.println("Under Age Ticket booked");
					System.out.println("Ticket booked Successfully ");
					System.out.println("---------------------------------------------");
					continue;
				}
				if(BP.equals("LB"))
				{
					if(LB!=0)
					{
						Ticket.berthPerference="LB";
						LB--;
						ticketsLeft--;
						totalAvailableTickets--;
						System.out.println("Lower Berth allotted");
					}
					else if (MB!=0)
					{
						Ticket.berthPerference="MB";
						MB--;
						ticketsLeft--;
						totalAvailableTickets--;
						System.out.println("Lower Berth is not available,Middle Berth allotted");
					}
					else if(UB!=0)
					{
						Ticket.berthPerference="UB";
						UB--;
						ticketsLeft--;
						totalAvailableTickets--;
						System.out.println("Lower Berth is not available,Upper Berth allotted");
					}
					else if(RAC!=0)
					{
						Ticket.berthPerference="RAC";
						RAC--;
						ticketsLeft--;
						totalAvailableTickets--;
						System.out.println("Lower Berth is not available,RAC allotted");
					}
					else
					{
						Ticket.berthPerference="WL";
						WL--;
						ticketsLeft--;
						totalAvailableTickets--;
						System.out.println("Lower Berth is not available,Waiting list allotted");
					}
					System.out.println("Ticket booked Successfully ");
					System.out.println("---------------------------------------------");
				}
				else if(BP.equals("MB"))
				{

					if(MB!=0)
					{
						Ticket.berthPerference="MB";
						MB--;
						ticketsLeft--;
						totalAvailableTickets--;
						System.out.println("Middle Berth allotted");
					}
					else if (LB!=0)
					{
						Ticket.berthPerference="LB";
						LB--;
						ticketsLeft--;
						totalAvailableTickets--;
						System.out.println("Middle Berth is not available,Lower Berth allotted");
					}
					else if(UB!=0)
					{
						Ticket.berthPerference="UB";
						UB--;
						ticketsLeft--;
						totalAvailableTickets--;
						System.out.println("Middle Berth is not available,Upper Berth allotted");
					}
					else if(RAC!=0)
					{
						Ticket.berthPerference="RAC";
						RAC--;
						ticketsLeft--;
						totalAvailableTickets--;
						System.out.println("Middle Berth is not available,RAC allotted");
					}
					else
					{
						Ticket.berthPerference="WL";
						WL--;
						ticketsLeft--;
						totalAvailableTickets--;
						System.out.println("Middle Berth is not available,Waiting list allotted");
					}
					System.out.println("Ticket booked Successfully ");
					System.out.println("---------------------------------------------");
				}
				else if(BP.equals("UB"))
				{

					if(UB!=0)
					{
						Ticket.berthPerference="UB";
						UB--;
						ticketsLeft--;
						totalAvailableTickets--;
						System.out.println("Upper Berth allotted");
					}
					else if (LB!=0)
					{
						Ticket.berthPerference="LB";
						LB--;
						ticketsLeft--;
						totalAvailableTickets--;
						System.out.println("Upper Berth is not available,Lower Berth allotted");
					}
					else if(MB!=0)
					{
						Ticket.berthPerference="MB";
						MB--;
						ticketsLeft--;
						totalAvailableTickets--;
						System.out.println("Upper Berth is not available,Middle Berth allotted");
					}
					else if(RAC!=0)
					{
						Ticket.berthPerference="RAC";
						RAC--;
						ticketsLeft--;
						totalAvailableTickets--;
						System.out.println("Upper Berth is not available,RAC allotted");
					}
					else
					{
						Ticket.berthPerference="WL";
						WL--;
						ticketsLeft--;
						totalAvailableTickets--;
						System.out.println("Upper Berth is not available,Waiting list allotted");
					}
					System.out.println("Ticket booked Successfully ");
					System.out.println("---------------------------------------------");
				}
			}
			ticketCount+=n;
		}
	}
	public static void printTicket()
	{
		if(Tickets[0]==null)
		{
			System.out.println("No seats were booked ");
		}
		else
		{
			System.out.println("-------------------------------------------------");
			System.out.println("S.NO  PNR No  AGE  GENDER  BERTH STATUS   NAME");
			System.out.println("-------------------------------------------------");
			for(int i=0;i<Tickets.length;i++)
			{
				Passenger elem=Tickets[i];
				if(elem==null)
				{
					continue;
				}
				System.out.println("  "+elem.SNO+"     "+elem.pnr+"     "+elem.age+"      "
			                        +elem.gender+"         "+elem.berthPerference+"        "+elem.name);
			}
			System.out.println("Total seats filled are "+ticketCount);
		}
		
	}
	public static void cancellation ()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter booked ticket pnr");
		int cancelPnr=s.nextInt();
		System.out.println("Enter booked ticket S.NO");
		int SNO=s.nextInt();
		int racIndex=Integer.MAX_VALUE;
		int wlIndex=Integer.MAX_VALUE;
		int checkChild=0;
		for(int i=0;i<Tickets.length;i++)
		{
			if(Tickets[i]==null)
				continue;
			if(Tickets[i].age<=5 && Tickets[i].pnr==cancelPnr)
				checkChild++;
			if(Tickets[i].berthPerference=="RAC" && racIndex==Integer.MAX_VALUE) // second condition is to stop at 1st RAC index if multiple RAC exists
			{
				racIndex=i;
			}	
			if(Tickets[i].berthPerference=="WL" && wlIndex==Integer.MAX_VALUE) // second condition is to stop at 1st WL index if multiple WL exists
			{
				wlIndex=i;
			}	
		}
//		System.out.println("child count with same pnr are "+checkChild);
		for(int i=0;i<Tickets.length;i++)
		{
			if(Tickets[i]==null)
				continue;
			if(Tickets[i].SNO==SNO && Tickets[i].age<=5) // If cancelled ticket is children, just remove the ticket
			{
				Tickets[i]=null;
				ticketCount--;
				totalAvailableTickets--;
			}
			else if (Tickets[i].SNO==SNO)  // If cancelled ticket is adult,remove the ticket then move RAC to confirmed and WL to RAC 
			{
				String berthFreed=Tickets[i].berthPerference;
				int SNOFreed=Tickets[i].SNO;
				if(berthFreed=="LB")// Taking the Freed Berth to account
					LB++;
				else if(berthFreed=="MB")
					MB++;
				else
					UB++;
				if(checkChild==0)//Check if the cancelled ticket accompanies children 
				{
					if(RAC!=2)  // Check if the RAC exists or not 
					{
						String racBerth=Tickets[racIndex].berthPerference;
						int racSNO=Tickets[racIndex].SNO;
						Tickets[racIndex].berthPerference=berthFreed;
						Tickets[racIndex].SNO=SNOFreed;
						Tickets[i]=Tickets[racIndex];
						Tickets[racIndex]=null;
						if(WL!=2)
						{
							System.out.println(wlIndex+" "+racIndex);
							Tickets[wlIndex].berthPerference=racBerth;
							Tickets[wlIndex].SNO=racSNO;
							Tickets[racIndex]=Tickets[wlIndex];
							Tickets[wlIndex]=null;
							WL++;
							totalAvailableTickets++;
							ticketCount--;
						}
						else
						{
							RAC++;
							totalAvailableTickets++;
							ticketCount--;
						}
						
					}
					else
					{
						Tickets[i]=null;
						totalAvailableTickets++;
						ticketCount--;
					}
				}
				else
				{
					//Check if the cancelled ticket accompanies children and cancelled this ticket as well if exists
					int pnrOfCancelTicket=Tickets[i].pnr;
					int pnrCount=0;
					int childCount=0;
					for(Passenger j:Tickets) // Traverse the Tickets to get the No of Tickets in same pnr and Children in them
					{
						if(j==null)
							continue;
						if(j.pnr==pnrOfCancelTicket)
							pnrCount++;
						if(j.age<=5)
							childCount++;
					}
					if(pnrCount-childCount==1)  // Checking if a Ticket with unique pnr has more than one adult
					{
						
					}
					else  
					{
						
					}
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner s =  new Scanner(System.in);
		System.out.println("Welcome to Railway Ticket Booking.......");
		int login;
		do 
		{
			System.out.println("1. View Availablity\n"
			          +"2. Ticket Booking\n"
			          +"3. Cancel Booked Ticket\n"
			          +"4. Print Booked Ticket\n"
			          +"5. Exit ");
			System.out.println("----------------------------------------------");
			System.out.println("Select one of the options to proceed further");
			System.out.println("----------------------------------------------");
			login=s.nextInt();
			switch(login)
			{
			case 1:
				System.out.println("Total ticket availability display loading.....please wait");
				viewAvailability();
				break;
			case 2:
				System.out.println("Ticket Booking console loading....... please wait");
				booking();
				break;
			case 3:
				System.out.println("Cancellation process initiated....... please wait");
				cancellation();
				break;
			case 4:
				System.out.println("Printing the Booked tickets");
				printTicket();
				break;
			case 5 :
				System.out.println("Thank you for using our service");
				break;
			default:
				System.out.println("Error enter one of the provided function keys ranging from 1 to 5");
			}
		}while(login!=5);
	}

}
