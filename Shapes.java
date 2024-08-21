package lab24;

import java.util.Scanner;

abstract class shape{
	void numberOfSides() {
		
	}
}
class Rectangle extends shape{
	int s;
	Rectangle(int s){
		this.s=s;
	}
	void numberOfSides() {
		System.out.println("I am a Rectangle. I have "+s+" sides.");
		System.out.println("Sum of Angles = "+((s-2)*180));
	}
}

class Triangle extends shape{
	int s;
	Triangle(int s){
		this.s=s;
	}
	void numberOfSides() {
		System.out.println("I am a Triangle. I have "+s+" sides.");
		System.out.println("Sum of Angles = "+((s-2)*180));
	}
}
class Hexagon extends shape{
	int s;
	Hexagon(int s){
		this.s=s;
	}
	void numberOfSides() {
		System.out.println("I am a Hexagon. I have "+s+" sides.");
		System.out.println("Sum of Angles = "+((s-2)*180));
	}
}
public class Shapes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String y="y";
		String opt;
		do {
			System.out.print("\nEnter no. of side for the geometric shape: ");
			int sides = sc.nextInt();
			if(sides==3) {
				Triangle t = new Triangle(sides);
				t.numberOfSides();
			}
			else if(sides==4) {
				Rectangle r = new Rectangle(sides);
				r.numberOfSides();
			}
			else if(sides==6) {
				Hexagon h = new Hexagon(sides);
				h.numberOfSides();
			}
			else {
				System.out.println("Shape with "+sides+" sides is not supported");
			}
			
			System.out.print("Do you want to continue? (y/n): ");
			opt = sc.next();
			
		}while(opt.equalsIgnoreCase(y));
		sc.close();
		System.out.println("Exiting program. Goodbye!");
	}
}
