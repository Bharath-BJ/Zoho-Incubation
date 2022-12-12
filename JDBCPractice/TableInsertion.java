package JDBCPractice;
import java.sql.*;
public class TableInsertion {

	public static void main(String[] args) throws Exception
	{
		// Internally static block executes the register driver during the class loading
		// DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/bharath";
		String user="root";
		String pwd="Bharath07*";
		
		// There are two methods to insert the values into the tables
		// 1) Using the create statement obj 
		// 2) Using the 
		method1(url,user,pwd);
		method2(url,user,pwd);
	}
	public static void method1(String url,String user,String pwd) throws Exception
	{
		int id=3;
		String name="Karthikeyan";
		// if values are fed as variables
		String query="insert into worker values("+id+",'"+name+"')";
		// if directly values are given
		// String query="insert into worker values(3,'Karthikeyan')";
		Connection con = DriverManager.getConnection(url,user,pwd);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		System.out.println(count+" rows affected");
	}
	public static void method2(String url,String user,String pwd) throws Exception
	{
		int id=4;
		String name="Karthik";
		// if values are fed as variables
		String query="insert into worker values("+id+",'"+name+"'),(5,'Vignesh')";
		// if directly values are given
		// String query="insert into worker values(3,'Karthikeyan')";
		Connection con = DriverManager.getConnection(url,user,pwd);
		// Here query is passed to the prepareStatement function
		PreparedStatement st = con.prepareStatement(query);
		int count = st.executeUpdate();
		System.out.println(count+" rows affected");
	}

}
