package chuong2.bai2;

public class Bai2 {


	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
	}
	public static void question1() {
		boolean result = (2 < 3) || (4 > 3);
		System.out.println(result);
		
	}
	public static void question2()  {
		boolean c = (2<3)&&(4>3);
		System.out.println(c);
	}
	public static void question3() {
		boolean c = (2<3)&&(4<3);
		System.out.println(c);
	}
	public static void question4() {
		boolean c = !(2>4);
		System.out.println(c);
	}
	public static void question5() {
		boolean c = 2==3 ;
		System.out.println(c);
	}
	public static void question6() {
		boolean c = 4!=3;
		System.out.println(c);
	}


}
