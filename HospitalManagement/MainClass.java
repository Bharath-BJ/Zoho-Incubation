package HospitalManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainClass {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) throws Exception 
	{
		System.out.println("WELCOME!!! ");
		SchemasDup.createSchema();
		SchemasDup.createLog();
		int choice;
		do 
		{
			System.out.println("1 - Register for Consultation \n2 - Display Patient Log \n3 - Exit");
			choice=s.nextInt();
			switch(choice) 
			{
			
			case 1:
				{
					System.out.println("Enter your details in the application form");
					System.out.println("Enter your name ");
					String name = s.next();
					System.out.println("Enter the Mobile number ");
					String mobileNo=s.next();
					boolean entryStatus=SchemasDup.checkEntry(name,mobileNo);
					String inTime=SchemasDup.getCurrentTime();
					if(entryStatus)
					{
//						System.out.println(entryStatus);
						System.out.println("Existing entry noted, You had previously visited our hospital ");
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","bharath994420@gmail.com");
						Statement st=con.createStatement();
						st.execute("update patientDetails set inTime='"+inTime+"' where Name='"+name+"' AND MobileNo='"+mobileNo+ "'");
						int ID = SchemasDup.getID(name, mobileNo, inTime);
						SchemasDup.consultationTime(ID, inTime);
						
					}
					else
					{
//						System.out.println(entryStatus);
						System.out.println("New entry noted");
						SchemasDup.register(name,mobileNo,inTime);
						int ID = SchemasDup.getID(name, mobileNo, inTime);
						SchemasDup.consultationTime(ID, inTime);
					}
				}
				break;
			case 2:
				SchemasDup.displayPatientLog();
				break;
			case 3:
				System.out.println("Thanks you for using our service......");
				break;
			default:
				System.out.println("Enter one of the available valid options either 1 or 2 or 3");
			}
		}while(choice!=3);
	}
}
