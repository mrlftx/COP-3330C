package Shapes;

public class Rectangle {
	double length;
	double width;
	
	public double getLength(){
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setLength(double L) {
		this.length = L;
	}
	
	public void setWidth(double W) {
		this.width = W;
	}
	
	public Rectangle(double L, double W) {
		this.setLength(L); 
		this.setWidth(W);
	}
	
	public Rectangle() {
		this.setLength(0); 
		this.setWidth(0);
	}
	
	public double computeArea() {
		double area = length * width;
		return area;
	}
	
	
}

