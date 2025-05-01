package unitv;

import java.sql.*;

public class DBUpdate {
	public static void main(String [] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","");
			System.out.println("Connection Established");
			Statement stmt = connection.createStatement();		
			String updateQuery = "Update Table1 Set name ='Java Programming' where srno=40";
			int response = stmt.executeUpdate(updateQuery);
			System.out.println(response);
			connection.close();
			System.out.println("Connection Terminated");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
