/* Class Box to compute Volume */
class Box {
    double width;
    double height;
    double depth;

	/* Method computes Volume and displays */
    void volume() {
        double volume1 = width * height * depth;
        System.out.println("Volume is: " + volume1);
    }
	
	/* Method computes Volume and returns the value */
    double volume2() {
        return width * height * depth;
    } 
	
	/* Method takes arguments and returns */
	double volume3(double w, double h, double d) {
		return w*h*d;
	}

	/* Method that sets the member variables */
	void setDimensions(double w, double d, double h) { 
		width = w;
		depth = d;
		height = h;
	}
}
class Program16 {
    public static void main(String [] args) {
        Box b1 = new Box();

        b1.width = 5;
        b1.height = 10;
        b1.depth = 15;

        b1.volume();

        Box b2 = new Box();
        b2.width = 2;
        b2.height = 5;
        b2.depth = 10;

        b2.volume();
		double b1volume = b1.volume2();
		
		System.out.println("Volume using Return Statement of box b1: " + b1volume);
		
        System.out.println("Volume using Return Statement of box b1: " + b1.volume2());

        b2.depth = 20;
        double v3 = b2.volume2();
        System.out.println("Volume using Return Statement of box b2: " + v3);
	
		Box b3 = new Box();
		System.out.println("Volume using Return Statement of box b3: " + b3.volume3(6,7,8));
        
		Box b4 = new Box();
		b4.setDimensions(9,10,11);
		System.out.println("Volume using Return Statement of box b4: " + b4.volume2());


    }
}