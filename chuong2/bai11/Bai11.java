package chuong2.bai11;
import java.util.Scanner;
public class Bai11 {

	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double Bankinh = sn.nextDouble();
		double chuvihinhtron=2*Math.PI*Bankinh;
		double dientichhinhtron=Math.PI*Math.pow(Bankinh,2);
		System.out.println(chuvihinhtron);
		System.out.println(dientichhinhtron);
		sn.close();
		}

}
