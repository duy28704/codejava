package baitapchuong3.bai9;

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
	

	public static void main(String[] args) {
        
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(5, 10);
        rectangles[1] = new Rectangle(8, 15);
        rectangles[2] = new Rectangle(12, 7);
}
}