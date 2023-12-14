package baitapchuong3.bai8;

public class Rectangle extends Shape{
	private int length ;
	private int width;
	public Rectangle() {
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Rectangle" + super.toString()+"length=" + length + ", width=" + width + "area=" + getArea();
	}
	public double getArea() {
		int area = length * width ;
		return area;
	}
}
