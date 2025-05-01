package unitiii;

public class Program3 {

	public static void main(String[] args) {
		// Number to Various Formats
		int num = 2020;
		System.out.println(num + " in binary: " + Integer.toBinaryString(num));
		System.out.println(num + " in octal: " + Integer.toOctalString(num));
		System.out.println(num + " in hexadecimal: " + Integer.toHexString(num));
		
		// String to Various Formats
		String str = "120";
		//String str = "2020" // Runtime exception for Byte case
		Integer i = Integer.parseInt(str);
		System.out.println("Integer i = " + i);
		
		Byte b = Byte.parseByte(str);
		System.out.println("byte b = " + b);
		
		Short s = Short.parseShort(str);
		System.out.println("short s= " + s);
		
		Long l = Long.parseLong(str);
		System.out.println("long l= " + l);
		
		try {
			//String str1 = "20a";//Runtime Exception
			String str1="20";
			Integer i1 = Integer.parseInt(str1);
			System.out.println(i1);
		} catch(NumberFormatException  nfe) {
			//nfe.printStackTrace();
			System.out.println(nfe);
		}
	}
}
