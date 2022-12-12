package HospitalManagement;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import HospitalSurya.DB;
public class Main 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) throws Exception 
	{
		System.out.println("WELCOME!!! ");
		Schemas.createSchema();
		Schemas.createLog();
		welcome();
		
	}
	public static void welcome()throws Exception 
	{
		System.out.println("Enter your details in the application form");
		System.out.println("Enter your name ");
		String name = s.next();
		System.out.println("Enter the Mobile number ");
		String mobileNo=s.next();
//		System.out.println("Enter your IN time ");
		LocalTime time = LocalTime.now();  
		DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm a");
		String inTime=format.format(time);
		boolean entryStatus=Schemas.checkEntry(name,mobileNo,inTime);
		if(entryStatus)
		{
//			System.out.println(entryStatus);
			System.out.println("Existing entry noted, You had previously visited our hospital ");
			existingEntry(name,mobileNo,inTime);
			
		}
		else
		{
//			System.out.println(entryStatus);
			System.out.println("New entry noted");
			newEntry(name,mobileNo,inTime);
		}
			
	}
	public static void newEntry(String name,String mobileNo,String inTime) throws Exception
	{
		int choice;
		do 
		{
			System.out.println("1 - Register for Consultation \n2 - Display Patient Log \n3 - Exit");
			choice=s.nextInt();
			switch(choice) 
			{
			
			case 1:
				{
				Schemas.register(name,mobileNo,inTime);
				int ID = Schemas.getID(name,mobileNo,inTime);
//				System.out.println(ID);
				Schemas.consultationTime(ID,inTime);
				welcome();
				
				}
				break;
			case 2:
				Schemas.displayPatientLog();
				break;
			case 3:
				System.out.println("Thanks you for using our service......");
				break;
			default:
				System.out.println("Enter one of the available valid options either 1 or 2 or 3");
			}
		}while(choice!=3);
	}
	
	
	public static void existingEntry(String name,String mobileNo,String inTime) throws Exception
	{
		
		int choice;
		do 
		{
			
			System.out.println("1 - Proceed with a Consultation \n2 - Display Patient Log \n2 - Exit");
			choice=s.nextInt();
			switch(choice) 
			{
			case 1:{
				int ID=Schemas.getID(name,mobileNo,inTime);
				Schemas.consultationTime(ID,inTime);
			}break;
			case 2:
				Schemas.displayPatientLog();
				break;
			case 3:
				System.out.println("Thanks you for using our service......");
				break;
			default:
				System.out.println("Enter one of the available valid options either 1 or 2 ");
			}
		}while(choice!=3);
	}

}
