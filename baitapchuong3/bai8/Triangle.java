package baitapchuong3.bai8;

public class Triangle extends Shape{
	private int base ;
	private int height;
	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		double area =  base * height * 1/2 ;
		return area ;
	}
	@Override
	public String toString() {
		return "Triangle"+ super.toString()+"base=" + base + ", height=" + height + "area=" + getArea();
	}

}
