package chuong2.bai6;
import java.util.Scanner;
public class Bai6 {


	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int a = sn.nextInt();
		int b = sn.nextInt();
		int tong = a + b ;
		int hieu = a - b ;
		int tich = a*b;
		int thuong = a/b ;
		System.out.println(tong);
		System.out.println(hieu);
		System.out.println(tich);
		System.out.println(thuong);
		sn.close();
	}

}
