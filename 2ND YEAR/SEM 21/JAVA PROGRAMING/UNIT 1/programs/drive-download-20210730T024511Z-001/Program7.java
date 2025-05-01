/* Program for type conversion */
class Program7 {
    public static void main(String [] args) {
        byte b=0;
        int i;
        double d;
        i = 512;
        d = 324.132;
        System.out.println("Initialised value of b : " + b);        
        System.out.println("Initialised value of i : " + i);
        System.out.println("Initialised value of d : " + d);
        // Typecast integer to byte
        b = (byte) i;
        System.out.println("typecasted value of int to byte : " + b);
        // Typecast double to integer
        i = (int) d;
        // Typecast double to byte
        b = (byte) d;
		
        System.out.println("typecasted value of double to int : " + i);
        System.out.println("typecasted value of double to byte : " + b);

        /* Automatic Type Conversion */
        float f = b + i;
        System.out.println("automatic typecasted value of int, byte to float : " + f);

        //byte b1 = f; - Assigning a higher type to byte
        byte b1 = (byte)f; // Valid Assignment
        System.out.println("typecasted value of float to byte : " + b1);

    }
}