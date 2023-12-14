package chuong2.bai1;

public class Bai1 {
	public static void main (String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
	}
	
		public static void question1() {
			int i = 5 ;
			int j = 2; 
			int x = i%j;
			int y = i/j ;
			System.out.println(x);  
			System.out.println(y);  
		}
		public static void question2() {
			int i = 10 ;
			int j = 10 ;
			int x ;
			x= --i + j-- ;
			System.out.println(x);
			// x = 9 + 10 = 20 
		}
		public static void question3() {
			int i = 5 ;
			int j=6;
			int x ;
			x = i++ + ++j ;
			System.out.println(x);
			}
		public static void question4() {
			int i =5 ;
			int j =2 ;
			float x = (float)i/j ;
			System.out.println(x);  
			
		}
		public static void question5() {
			int i =5 ;
			int j =2 ;
			float x = i/(float)j ;
			System.out.println(x);  
			
		}
		public static void question6() {
			int i =5 ;
			int j =2 ;
			float x = (float)i/(float)j ;
			System.out.println(x);  
			
		}
	}

