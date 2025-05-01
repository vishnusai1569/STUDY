package unitv;

import java.sql.*;

import javax.swing.*;

public class DBGUI {
	DBGUI(String output) {
		JFrame f = new JFrame();
		JTextArea area = new JTextArea(output); // create an object for the class textarea and set the default text to the records that are populated from the table
		area.setBounds(10, 30, 200, 200); // set the dimensions of the textarea
		f.add(area); // Add the textarea onto the frame
		f.setSize(300, 300); // set the size of the frame
		f.setLayout(null); 
		f.setVisible(true);
	}

	public static void main(String args[]) {
		String output = " ";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","");
			System.out.println("Connection Established");
			Statement stmt = connection.createStatement();		
			ResultSet rs = stmt.executeQuery("SELECT * FROM Table1");			
			while (rs.next() ) {
				System.out.println(rs.getInt(1) + ". " + rs.getString(2));
				output += rs.getInt(1) + ". " + rs.getString(2) + "\n";
			}			
			connection.close();
			System.out.println("Connection Terminated");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		new DBGUI(output);
	}
}