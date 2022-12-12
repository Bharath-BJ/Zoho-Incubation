package JDBCPractice;
import java.sql.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class TableManipulation {

	public static void main(String[] args) throws Exception
	{
		// Internally static block executes the register driver during the class loading
		// DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/bharath";
		String user="root";
		String pwd="Bharath07*";
		Connection con = DriverManager.getConnection(url,user,pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from employee");
		while(rs.next())
		{
//			System.out.println(rs.getInt("emp_id")+" " +rs.getString("name")+" "+rs.getString("role")+" "+rs.getInt("salary"));
			System.out.println(rs.getInt(1)+" " +rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
//		consultationTime(1,"06:15");
	}
	public static void consultationTime(int ID,String inTime) throws Exception {
		int staffTime=10;
		int pharmacyTime=5;
		int doctorTime=(int)(Math.random()*(20-2+1)+2);
		System.out.println(doctorTime);
		String dT=doctorTime+"";
		int totalTime=staffTime+pharmacyTime+doctorTime;
		String outTime = dateTime(inTime,totalTime);
		System.out.println(outTime);
	}
	static String dateTime(String pat_inTime,int totalConsultantTime) {
		DateTimeFormatter df=DateTimeFormatter.ofPattern("HH:mm");
		LocalTime lt=LocalTime.parse(pat_inTime);
		String outTime=df.format(lt.plusMinutes(totalConsultantTime));
		return outTime;
	}
}
