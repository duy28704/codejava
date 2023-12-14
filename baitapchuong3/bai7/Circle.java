package baitapchuong3.bai7;

public class Circle implements GeometricObject{
	protected double radius =1.0;
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPerimeter() {
		double perimeter = 2*radius*Math.PI;
		return perimeter ;
	}
	public double getArea() {
		double Area = radius*radius*Math.PI;
		return Area;
		
	}

}
