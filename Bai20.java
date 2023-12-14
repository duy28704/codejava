package chuong2.bai20;
import java.util.Scanner;
public class Bai20 {


	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double doC = sn.nextDouble();
		double doF= doC*1.8+32;
		System.out.print(doC + " độ C tương ứng với " + doF + " độ F ");
		sn.close();
	}

}
