package unitiii;

public class Program4 {
	public static void main(String[] args) {
		char a[] = { 'a', 'b', '5', '?', 'A', ' ' }; // Declare an array identified by a.  with six elements. 
		// 2 are lower case alphabets
		// a numeral
		// a special character
		// upper case alphabet
		// empty character
		System.out.println("Length of the array a is:" +a.length);
		
		for (int i = 0; i < a.length; i++) {
			if (Character.isDigit(a[i])) // Wrapper Class Character = method -isDigit.
				System.out.println(a[i] + " is a digit.");
			if (Character.isLetter(a[i]))
				System.out.println(a[i] + " is a letter.");
			if (Character.isWhitespace(a[i]))
				System.out.println(a[i] + " is whitespace.");
			if (Character.isUpperCase(a[i]))
				System.out.println(a[i] + " is uppercase.");
			if (Character.isLowerCase(a[i]))
				System.out.println(a[i] + " is lowercase.");
		}
	}
}
