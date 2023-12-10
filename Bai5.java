package chuong2.bai5;
import java.util.Scanner;
public class Bai5 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int a = sn.nextInt();
		float b = sn.nextFloat();
		char c = sn.next().charAt(0);
		sn.nextLine();
		String d = sn.nextLine();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		sn.close();
	}

}
