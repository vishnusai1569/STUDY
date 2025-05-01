class Box {
    double width;
    double height;
    double depth;
}
class Program15 {
    public static void main(String [] args) {
        Box b1 = new Box();
        double volume;

        b1.width = 5;
        b1.height = 10;
        b1.depth = 15;
		System.out.println("Volume of " +  b1.width + " * " + b1.height + " * " + b1.depth);
        volume = b1.width * b1.height * b1.depth;

        System.out.println("Volume is: " + volume);

        Box b2;
        b2 = new Box();
        double volume2;

        b2.width = 2;
        b2.height = 3;
        b2.depth = 4;
		System.out.println("Volume of " +  b2.width + " * " + b2.height + " * " + b2.depth);
        volume2 = b2.width * b2.height * b2.depth;

        System.out.println("Volume of b2 is : " + volume2);

        Box b3 = b2;
        double volume3;
        //b2 = null; 
		//Will generate Error while computing volume2
        b3.width = 20;
        b3.height = 30;
        b3.depth = 40;

        volume3 = b3.width * b3.height * b3.depth;
        System.out.println("Volume of b3 is : " + volume3);

        volume2 = b2.width * b2.height * b2.depth;
        System.out.println("Volume of b2 is : " + volume2);

    }
}