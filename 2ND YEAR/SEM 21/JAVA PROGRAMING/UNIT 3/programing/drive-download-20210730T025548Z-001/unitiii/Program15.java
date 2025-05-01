package unitiii;

import java.io.*;

public class Program15 {

	public static void main(String[] args) {
		String source = "SITA1301\n" + " Programming in JAVA\n" + " BE CSE - III Semester / II Year ";
		// Convert string to bytes
		byte buf[] = source.getBytes();
		System.out.println(source.length());
		System.out.println(buf.length);
		
		
		//Create objects for the FileOutputStream 
		FileOutputStream f0 = null;
		FileOutputStream f1 = null;
		FileOutputStream f2 = null;

		try {
		
			f0 = new FileOutputStream("file1.txt");
			f1 = new FileOutputStream("file2.txt");
			f2 = new FileOutputStream("file3.txt");
			
			// write to first file by skipping two bytes
			for (int i = 0; i < buf.length; i += 2)
				f0.write(buf[i]);
			
			// write to second file with all data
			f1.write(buf);
			
			// write to third file with starting at some offset and ends.
			System.out.println("Buffer Length: " + buf.length);
			System.out.println("Buffer Length / Four: " + buf.length / 4.0);
			System.out.println("Buffer Length - Buffer Length / Four: " + (buf.length  - buf.length / 4.0));
			f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
			//f2.write("sita....", 48, 15);
			
		} catch (IOException e) {
			System.out.println("An I/O Error Occurred");
		} finally {
			try {
				if (f0 != null)
					f0.close();
			} catch (IOException e) {
				System.out.println("Error Closing file1.txt");
			}
			try {
				if (f1 != null)
					f1.close();
			} catch (IOException e) {
				System.out.println("Error Closing file2.txt");
			}
			try {
				if (f2 != null)
					f2.close();
			} catch (IOException e) {
				System.out.println("Error Closing file3.txt");
			}
		}

	}

}
