package unitiii;

// Input in Java

//Method 1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//Method 2
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) throws IOException {
		
		//Method 1
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Name - Buffered Reader: ");
		//JAVA, 11.11, 11, 17-10-2020, 9:40, &*$$
		String name1 = reader.readLine();
		System.out.println("Entered name is :"+name1);
		
		//Method 2
		Scanner in = new Scanner(System.in);
		System.out.println("Name - Scanner: ");
        String name2 = in.nextLine().toString();
        System.out.println(name2);
        
        System.out.println("Integer - Scanner: ");
        int i = in.nextInt();
        System.out.println(i);
        
        System.out.println("Float - Scanner: ");
        float f = in.nextFloat();
        System.out.println(f);
	}

}
