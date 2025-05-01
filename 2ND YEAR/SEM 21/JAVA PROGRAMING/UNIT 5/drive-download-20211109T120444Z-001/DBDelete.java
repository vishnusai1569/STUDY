package unitv;

import java.sql.*;

public class DBDelete {
	public static void main(String [] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","");
			System.out.println("Connection Established");
			Statement stmt = connection.createStatement();		
			String deleteQuery = "Delete from Table1 where srno=40";
			int response =	stmt.executeUpdate(deleteQuery);
			System.out.println("Delete Status " + response);
			connection.close();
			System.out.println("Connection Terminated");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
