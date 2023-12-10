package chuong2.bai3;

public class Bai3 {
		public static void main(String[] args) {
			int a=10;
			int b=100;
			question1(a,b);
			question2(a,b);
			question3(a,b);
			question4(a);
			question5(a);
			question6(b);
		}
		public static void question1(int a , int b ) {
			int c = a|b;
			System.out.println(c);
		}
		public static void question2(int a , int b ) {
			int c = a&b;
			System.out.println(c);
		}
		public static void question3(int a , int b ) {
			int c = a^b;
			System.out.println(c);
		}
		public static void question4(int a ) {
			int c = ~a;
			System.out.println(c);
		}
		public static void question5(int a  ) {
			int c = a>>2;
			System.out.println(c);
		}
		public static void question6( int b) {
			int c = b<<2;
			System.out.println(c);
		}
	}