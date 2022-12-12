package HospitalManagement;


import java.sql.Connection;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.sql.*;
import java.util.*;

public class SchemasDup
{
	static Scanner s= new Scanner(System.in); 
	public static void createSchema() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/","root","bharath994420@gmail.com");
		Statement st=con.createStatement();
		st.executeUpdate("CREATE DATABASE IF NOT EXISTS HOSPITAL");
		con.close();
		st.close();
	}
	public static void createLog() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","bharath994420@gmail.com");
		Statement st=con.createStatement();
		st.executeUpdate("CREATE TABLE IF NOT EXISTS PatientDetails"
				+ "(ID int auto_increment primary key,Name varchar(30),MobileNo varchar(20),"
				+ "InTime varchar(20),ConsultingTime int,WaitingTime int, OutTime varchar(20))");
		con.close();
		st.close();
	}
	public static String getCurrentTime() {
		LocalTime now = LocalTime.now();
		DateTimeFormatter time = DateTimeFormatter.ofPattern("hh:mm a");
		String inTime = time.format(now);
	return inTime;
	}
	public static boolean checkEntry(String name,String mobileNo)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","bharath994420@gmail.com");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select * from PatientDetails where Name='"+name+"' AND MobileNo='"+mobileNo+ "'");
		boolean result=rs.next();
//		if(result) // if true just update the inTime
//		{
//			//st.execute("update patientDetails set inTime='"+inTime+"' where Name='"+name+"' AND MobileNo='"+mobileNo+ "'");
//		}
	return result;
	}
	public static void register(String name,String mobileNo,String inTime)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","bharath994420@gmail.com");
		PreparedStatement st=con.prepareStatement("Insert into PatientDetails (Name,MobileNo,InTime)"
				+ " values ('"+name+"','"+mobileNo+"','"+inTime+"')");
		st.executeUpdate();
		
	}	
	public static int getID(String name,String mobileNo,String inTime)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","bharath994420@gmail.com");
		Statement st=con.createStatement();
//		System.out.println(name+" "+mobileNo+" "+inTime);
		ResultSet rs = st.executeQuery("select ID from PatientDetails "
				+ "where Name='"+name+"' AND MobileNo='"+mobileNo+ "' AND InTime='"+inTime+"'");
		rs.next();
	return rs.getInt("ID");
	}
	public static void consultationTime(int ID,String inTime) throws Exception {
		int staffTime=10;
		int pharmacyTime=5;
		int consultingTime=(int)(Math.random()*(20-2+1)+2);
		int totalTime=staffTime+pharmacyTime+consultingTime;
		String outTime = dateTime(inTime,totalTime);
		int waitingTime=totalTime-25;
		if(waitingTime<0)
			waitingTime=0;
		updateTable(ID,consultingTime,waitingTime,outTime);
		displayPatientDetail(ID);
		if(waitingTime>0) 
			System.out.println("Sorry for taking your precious time ");
	}
	public static String dateTime(String inTime,int totalConsultantTime) {
		DateTimeFormatter df=DateTimeFormatter.ofPattern("hh:mm a");
		LocalTime lt=LocalTime.parse(inTime,df);
		String outTime=df.format(lt.plusMinutes(totalConsultantTime));
		return outTime;
	}
	public static void updateTable(int ID,int consultingTime,int waitingTime,String outTime)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","bharath994420@gmail.com");
		Statement st = con.createStatement();
		String query = "update PatientDetails set consultingTime='"+consultingTime+"',waitingTime='"+waitingTime+
				"',outTime='"+outTime+"' where ID="+ID ;
		st.executeUpdate(query);
	}
	public static void displayPatientDetail(int ID) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","bharath994420@gmail.com");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select * from PatientDetails where ID="+ID);
		rs.next();
		System.out.println("--------------------------------------------------");
		System.out.println(" ID    NAME    MOBILENO    INTIME   CONSULTING-TIME   WAITING-TIME    OUT-TIME ");
		System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"  "+rs.getString(3)+"     "+rs.getString(4)
		+"     "+rs.getString(5)+"                "+rs.getString(6)+"           "+rs.getString(7));
		System.out.println("--------------------------------------------------");
	}
	public static void displayPatientLog() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","bharath994420@gmail.com");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select * from PatientDetails");
		System.out.println("--------------------------------------------------");
		System.out.println(" ID    NAME    MOBILENO    INTIME   CONSULTING-TIME   WAITING-TIME    OUT-TIME ");
		while(rs.next())
		{
			
			System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"  "+rs.getString(3)+"     "+rs.getString(4)
			+"     "+rs.getString(5)+"                "+rs.getString(6)+"           "+rs.getString(7));
		}
		System.out.println("--------------------------------------------------");
		
	}
	
}

