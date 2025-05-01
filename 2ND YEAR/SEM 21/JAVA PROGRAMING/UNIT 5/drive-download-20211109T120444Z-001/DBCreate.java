package unitv;

import java.sql.*;

public class DBCreate {
	public static void main(String [] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","");
			System.out.println("Connection Established" + connection);
			
			Statement stmt = connection.createStatement();
			String createTableQuery = "CREATE TABLE REGISTRATION10 " +
	                   "(id INTEGER not NULL, " +
	                   " firstName VARCHAR(255), " + 
	                   " lastName VARCHAR(255), " + 
	                   " age INTEGER, " + 
	                   " PRIMARY KEY ( id ))";
			stmt.executeUpdate(createTableQuery);
			
			stmt.close();
			connection.close();
			System.out.println("Connection Terminated");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
