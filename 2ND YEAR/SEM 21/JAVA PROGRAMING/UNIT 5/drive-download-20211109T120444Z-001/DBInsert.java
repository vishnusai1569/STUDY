package unitv;

import java.sql.*;

public class DBInsert {
	public static void main(String [] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","");
			System.out.println("Connection Established");
			Statement stmt = connection.createStatement();		
			String insertQuery = "Insert into Table1 Values(10, 'SIST')";
			int response = stmt.executeUpdate(insertQuery);
			System.out.println(response);
			insertQuery = "Insert into Table1 Values(20, 'CSE')";			
			response = stmt.executeUpdate(insertQuery);
			System.out.println(response);
			insertQuery = "Insert into Table1 Values(30, 'B1')";
			response = stmt.executeUpdate(insertQuery);
			System.out.println(response);
			insertQuery = "Insert into Table1 Values(40, 'JAVA')";
			response = stmt.executeUpdate(insertQuery);
			System.out.println(response);			
			insertQuery = "Insert into Table1 Values(50, 'SOC')";
			response = stmt.executeUpdate(insertQuery);
			System.out.println(response);			
			connection.close();
			System.out.println("Connection Terminated");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
