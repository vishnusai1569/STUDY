package unitiii;

//import the library / package
//import java.io.*;
//Or
import java.io.File;
public class Program10 {

	public static void main(String[] args) {
		// File Class
		
		File f1 = new File("C:\\Users\\Murugan\\Google Drive\\SITA1301\\sourcecodes\\Unit_III\\src\\unitiii\\Program10.java"); // Relative Path
		// Absolute Path
		
		//File f1 = new File("C:\\Users\\Murugan\\Google Drive\\SITA1301\\sourcecodes");
		System.out.println("File Name: " + f1.getName());
		System.out.println("Path: " + f1.getPath());
		System.out.println("Absolute Path: " + f1.getAbsolutePath());
		System.out.println("Parent: " + f1.getParent());
		System.out.println(f1.exists() ? "exists" : "does not exist");
		/* if (f1.exists()) {
			System.out.println("exists");
			} else {
				System.out.println("does not exist");
			}*/
	
		System.out.println(f1.canWrite() ? "is writeable" : "is not writeable");
		System.out.println(f1.canRead() ? "is readable" : "is not readable");
		System.out.println("is " + (f1.isDirectory() ? "a directory" : "not" + " a directory"));
		System.out.println(f1.isFile() ? "is normal file" : "might be a named pipe");
		System.out.println(f1.isAbsolute() ? "is absolute" : "is not absolute");
		System.out.println("File last modified: " + f1.lastModified());
		System.out.println("File size: " + f1.length() + " Bytes");

	}

}
