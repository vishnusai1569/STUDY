public class Program13 {
    public static void main(String args[]) {
        System.out.println("Loop without Break");
        for(int i=1; i<=20; i++) {            
            System.out.println("i: " + i);
        }

        System.out.println("Loop with Break");
        for(int i=1; i<=20; i++) {
            if(i == 11) continue; // terminate loop if i is 10
            System.out.println("i: " + i);
        }

        System.out.println("Break with Nested Loops");
        for(int i=0; i<3; i++) { // outer loop
            System.out.print("Pass " + i + ": ");
            for(int j=1; j<100; j++) { // inner loop
                if(j % 10 == 0) continue; // terminate the inner loop if j is 11
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        System.out.println("Break as Goto");
        boolean t = true;
        first: {
            second: {
                third: {
                    System.out.println("Before the break.");
                    if(t) break second; // break out of second block
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }            
            System.out.println("This is after second block.");            
        }

        System.out.println("Using Continue");
        outer: for (int i=0; i<10; i++) { //outer loop
                    for(int j=0; j<10; j++) { // inner loop
                        if(j > i) {
                            System.out.println();
                            continue outer;
                        }
                        System.out.print(" " + (i + j));
                    }
                }
                System.out.println();

    }
}