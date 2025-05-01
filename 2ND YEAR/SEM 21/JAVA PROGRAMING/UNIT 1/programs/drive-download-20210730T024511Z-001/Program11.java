public class Program11 {
   public static void main(String [] args) {
        int x = 10;
        int y = 10;
        int z = 20;
        
        if (z > y) {
           System.out.println(z + " is greater than " + y);
        }

        if (x < z) {
            System.out.println(x + " is less than " + z);
        }

        if (x >= y) {
            System.out.println(x + " is greater than or equal to " + y);
        }
 
        if (x <= y) {
             System.out.println(x + " is less than or equal to " + y);
        }

        if (x == y) {
            System.out.println(x + " is equal to " + y);
        }

        if (x != z) {
            System.out.println(x + " is not equal to " + z);
        }
   } 
}