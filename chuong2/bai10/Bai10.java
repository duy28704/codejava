package chuong2.bai10;
import java.util.Scanner;
public class Bai10 {

	

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int chieurong= sn.nextInt();
		int chieudai=sn.nextInt();
		int dientich= chieurong*chieudai;
		int chuvi= (chieurong + chieudai)*2;
		System.out.println(dientich);
		System.out.println(chuvi);
		sn.close();
	}
	

}
