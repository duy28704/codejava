package baitapchuong3.bai7;

public class ResizableCircle  extends Circle implements Resizable{

	public ResizableCircle(double radius) {
		super(radius);
	}

		public void resize(int percent) {
			
	       this.radius = radius *(percent / 100.0);
	       System.out.print(radius);
	    }
	}


