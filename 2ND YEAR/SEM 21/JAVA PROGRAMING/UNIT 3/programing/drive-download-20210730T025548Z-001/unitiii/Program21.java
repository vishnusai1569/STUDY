package unitiii;

import java.io.*;

//FileReader

public class Program21 {

	public static void main(String[] args) {
		try {
			/*FileReader fr = new FileReader(
					"C:\\Users\\Murugan\\Google Drive\\SITA1301\\sourcecodes\\Unit_III\\src\\unitiii\\Program21.java");
			int c;
			while ((c = fr.read()) != -1) {
				System.out.print((char)c);
			}*/

			String source = "SITA1301\n" + " Programming in JAVA\n" + " BE CSE - III Semester / II Year";
			System.out.println(source.length());
			char buffer[] = new char[source.length()];
			source.getChars(0, source.length(), buffer, 0);			
			//for (int i=0; i<source.length();i++) 
			// buffer[i] = source[i];
			FileWriter f0 = new FileWriter("rw1.txt");
			FileWriter f1 = new FileWriter("rw2.txt");
			FileWriter f2 = new FileWriter("rw3.txt");
			// write to first file
			for (int i = 0; i < buffer.length; i += 2) {
				f0.write(buffer[i]);
			}
			f0.close();
			
			// write to second file
			f1.write(buffer);
			f1.close();
			
			// write to third file
			f2.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);
			// buffer.length = 62
			// buffer.length /4 = 15.
			
			// 62 -15 = 47
			f2.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
