package Shapes;

public class Main {
	
	public static void printRect(Rectangle R) {
		double area = R.computeArea();
		System.out.printf("The rectangle with sides %.2f and %.2f has an area of %.2f%n", R.length, R.width, area);
	}
	
	public static void printCirc(Circle C) {
		double area = C.computeArea();
		System.out.printf("The circle with radius %.2f has an area of %.5f%n", C.radius, area);
	}
	
	public static void main(String[] args) {
	Rectangle boxA = new Rectangle();
	Rectangle boxB = new Rectangle(3, 4);
	Circle barrelA = new Circle();
	Circle barrelB = new Circle(5);
	
	boxA.length = 3.3;
	boxA.width = 7.2;
	
	barrelA.radius = 4.6;
	
	printRect(boxA);
	printRect(boxB);
	printCirc(barrelA);
	printCirc(barrelB);
}
}
