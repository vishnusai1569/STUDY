package unitiii;

import java.io.*;

public class Program17 {

	public static void main(String[] args) {
		ByteArrayOutputStream f = new ByteArrayOutputStream();
		String s = "This should end up in the array";
		byte buf[] = s.getBytes();
		try {
			f.write(buf);
			for(int i=0;i<buf.length;i++)
				System.out.print((char)buf[i]);
		} catch (IOException e) {
			System.out.println("Error Writing to Buffer");
			return;
		}
		System.out.println(f);
	}

}
