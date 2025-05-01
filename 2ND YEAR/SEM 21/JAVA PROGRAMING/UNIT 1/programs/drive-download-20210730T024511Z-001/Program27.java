class Shape {
   public void display() {
      System.out.println("Inside display");
   }
}
class Rectangle extends Shape {
   public void area() {
      System.out.println("Inside area");
   }
   public void volume() {
      System.out.println("Inside Rectangle volume");
   }
   public void display() {
      System.out.println("Inside Rectangle display");
   }
}
class Cube extends Rectangle {
   public void volume() {
      System.out.println("Inside volume");
   }
   public void display() {
      System.out.println("Inside cube display");
   }
}
public class Program27 {
   public static void main(String[] arguments) {
      Cube cube = new Cube();
      cube.display(); // Method in Class Shape
      cube.area(); // Method in Class Rectangle
      cube.volume();
	  Rectangle rect = new Rectangle();
	  rect.display();
   }
}