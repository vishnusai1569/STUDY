package unitiii;

import java.io.*;

//RandomAccessFile

public class Program20 {

	static final String FILEPATH = "C:\\Users\\Murugan\\Google Drive\\SITA1301\\sourcecodes\\Unit_III\\raf.txt";

	private static byte[] readFromFile(String filePath, int position, int size) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "r");
		// When the file was opened in RAF mode,  the file pointer is placed at the BOF
		file.seek(position); // From 0, the file pointer moved to the location as given in  the variable position 
		byte[] bytes = new byte[size];
		file.read(bytes); // read the data starting from the given position and till the bytes array gets filled
		file.close();
		return bytes;
	}

	private static void writeToFile(String filePath, String data, int position) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "rw");
		file.seek(position);
		file.write(data.getBytes());
		file.close();
	}

	public static void main(String[] args) {

		try {
			
			System.out.println(readFromFile(FILEPATH, 31, 6));
			System.out.println(new String(readFromFile(FILEPATH, 31, 6)));
			
			writeToFile(FILEPATH, "\n School of Computing", 110);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
