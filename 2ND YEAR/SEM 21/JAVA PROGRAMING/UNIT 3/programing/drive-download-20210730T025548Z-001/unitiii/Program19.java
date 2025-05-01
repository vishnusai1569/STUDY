package unitiii;

import java.io.*;

// DataInputStream and DataOutputStream

public class Program19 {

	public static void main(String[] args) {
		try {
			//FileOutputStream fos = new FileOutputStream("dos_dis.dat");
			//DataOutputStream dos = new DataOutputStream(fos);
			
			// Phase I - Write the data on to the output file dos_dis.dat
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos_dis.dat"));
			dos.writeDouble(999.99);
			dos.writeBoolean(false);
			dos.writeInt(10000);
			
			// Phase II - Read the data from the file dos_dis.dat
			DataInputStream dis = new DataInputStream(new FileInputStream("dos_dis1.dat"));
			double d = dis.readDouble();
			boolean b = dis.readBoolean();
			int i = dis.readInt();
			System.out.println(d + "-" + b + "-" + i);
			
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}		
	}
}
