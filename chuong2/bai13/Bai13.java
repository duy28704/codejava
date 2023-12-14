package chuong2.bai13;
import java.util.Scanner;
public class Bai13 {


	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double Giaban = sn.nextDouble();
		double PhanTramGiamGia=sn.nextDouble();
		sn.close();
		double GiamGia = (PhanTramGiamGia/100)*Giaban;
		double Giadagiam = Giaban - GiamGia;
		System.out.print(Giadagiam);
	}

}
