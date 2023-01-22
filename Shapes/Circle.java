package Shapes;

public class Circle {
	double radius;
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double R) {
		this.radius = R;
	}
	
	public Circle(double R) {
		this.setRadius(R); 
	}
	
	public Circle() {
		this.setRadius(0); 
	}
	
	public double computeArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
}
