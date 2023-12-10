package chuong2.bai7;
import java.util.Scanner;
public class Bai7 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		float a = sn.nextFloat();
		float b = sn.nextFloat();
		char nhap = sn.next().charAt(0);
		switch(nhap){
		case 'A' : 
			System.out.println( a+b);
			break;
		case 'S' : 
			System.out.println( (float)a-b);
			break;
		case 'M' : 
			System.out.println( (float)a*(float)b);
			break;
		case 'D' : 
			System.out.println( (float)a/b);
			break;
		}
		sn.close();
	}

	

}
