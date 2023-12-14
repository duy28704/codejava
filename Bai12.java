package chuong2.bai12;
import java.util.Scanner;
public class Bai12 {



	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int Diem = sn.nextInt();
		if(Diem >= 90 && Diem <=100)
			System.out.println("Xếp loại A");
		if(Diem >= 80 && Diem < 90)
			System.out.println("Xếp loại B");
		if(Diem >= 70 && Diem < 80)
			System.out.println("Xếp loại C");
		if(Diem >= 50 && Diem <70)
			System.out.println("Xếp loại D");
		if(Diem <50)
			System.out.println("Xếp loại F");
		sn.close();

	}

}
