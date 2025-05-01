package unitv;

import java.sql.*;

public class DBSelect {
	public static void main(String [] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); //localhost
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","");
			System.out.println("Connection Established");
			Statement stmt = connection.createStatement();		
			String selectQuery = "SELECT * FROM Table1";
			ResultSet rs = stmt.executeQuery(selectQuery);
			while (rs.next() ) {
				System.out.println(rs.getInt(1) + ". " + rs.getString(2));
			}			
			connection.close();
			System.out.println("Connection Terminated");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
