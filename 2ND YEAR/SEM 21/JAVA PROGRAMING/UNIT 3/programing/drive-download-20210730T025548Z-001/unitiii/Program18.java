package unitiii;

import java.io.*;

public class Program18 {

	public static void main(String[] args) {

		// Console output
		PrintStream ps = new PrintStream(System.out); // Standard output 
		String s = "SIST";
		int i = 10;
		float f = 6.66f;
		ps.print(s);
		ps.println(true);
		ps.println(i);
		ps.println(f);

		// File Output Redirection
		try {
			FileOutputStream fos = new FileOutputStream("file51.txt");
			PrintStream fps = new PrintStream(fos);
			fps.print(s);
			fps.println(true);
			fps.println(i);
			fps.println(f);
			fps.println("Check file for errors:"+fps.checkError());
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}

	}

}
