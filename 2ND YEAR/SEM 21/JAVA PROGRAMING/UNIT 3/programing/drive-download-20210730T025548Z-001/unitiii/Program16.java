package unitiii;

import java.io.*;

public class Program16 {

	public static void main(String[] args) {
		String tmp = "SIST - Sathyabama Institute of Science and Technology";
		byte b[] = tmp.getBytes();
		ByteArrayInputStream input1 = new ByteArrayInputStream(b);
		ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 4);
		System.out.println(input1);
		System.out.println(input2);

		int c;
		while ((c = input1.read()) != -1) {
			System.out.print((char) c);			
		}
		/*
		 * This code will not display any output. 
		 * System.out.println();
		*/ 
		input1.reset();
		System.out.println("Second Read Statement:");
		while ((c = input1.read()) != -1) {
			System.out.print(Character.toUpperCase((char) c));
		}
		/*To resolve include the statement */ 
	     input1.reset();
		System.out.println("Third Read Statement:");
		System.out.println();
		while ((c = input2.read()) != -1) {
			System.out.print(Character.toUpperCase((char) c));
		}		

	}

}
