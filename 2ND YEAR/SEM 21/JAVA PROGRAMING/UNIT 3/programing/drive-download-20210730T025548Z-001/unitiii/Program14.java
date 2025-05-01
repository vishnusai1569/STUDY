package unitiii;

import java.io.*;

public class Program14 {

	public static void main(String[] args) {
		// FileInputStream and FileOutputStream

		int size;

		try {
			// String - location of the file that is to be read
			// File fo = new File("C:\\Users\\Murugan\\Google Drive\\SITA1301\\sourcecodes\\Unit_III\\src\\unitiii\\Program14.java");
			// FileInputStream f = new FileInputStream(fo);
			
			FileInputStream f = new FileInputStream(
					"C:\\Users\\Murugan\\Google Drive\\SITA1301\\sourcecodes\\Unit_III\\src\\unitiii\\Program14.java");
			
			//System.out.println("Total Available Bytes: " + (size = f.available()));
			
			// or
			
			size = f.available();
			System.out.println("Total Available Bytes: " + size);

			int n = size / 40;
			System.out.println("First " + n + " bytes of the file one read() at a time");
			/*for (int i = 0; i < n; i++) {
				System.out.print(f.read());
			}*/
			for (int i = 0; i < n; i++) {
				System.out.print((char) f.read()); // type cast byte to ascii codes
				}
		
			System.out.println("\nStill Available: " + f.available());
			System.out.println("Reading the next " + n + " with one read(b[])");
			byte b[] = new byte[n];
			if (f.read(b) != n) {
				System.err.println("couldn’t read " + n + " bytes.");
			}
			System.out.println(new String(b, 0, n));
			System.out.println("\nStill Available: " + (size = f.available()));
			System.out.println("Skipping half of remaining bytes with skip()");
			f.skip(size / 2);
			System.out.println("Still Available: " + f.available());
			System.out.println("Reading " + n / 2 + " into the end of array");
			if (f.read(b, n / 2, n / 2) != n / 2) {
				System.err.println("couldn’t read " + n / 2 + " bytes.");
			}
			System.out.println(new String(b, 0, b.length));
			System.out.println("\nStill Available: " + f.available());
			byte b1[] = new byte[f.available()];
			if (f.read(b1) != f.available()) {
				System.err.println("couldn’t read " + n + " bytes.");
			} 
			System.out.println(new String(b1,0,f.available()));
		}catch (IOException e) {
			System.out.println("I/O Error: " + e);
		}
	}
}