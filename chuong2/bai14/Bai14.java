package chuong2.bai14;
import java.util.Scanner;
public class Bai14 {

	public static void main(String[] args) {
		Scanner sn =new Scanner(System.in);
		int sodien = sn.nextInt();
		sn.close();
		double dongia1 =1484;
		double dongia2=1533;
		double dongia3=1786;
		double dongia4=2242;
		if(sodien >=0 && sodien<=50) {
			System.out.println( "Số tiền : " + (sodien * dongia1));
		}
		else if (sodien >=51 && sodien <=100)
			System.out.println("Số tiền :" + (50*dongia1 + (sodien-50)*dongia2));
			
		else if ( sodien>=101 && sodien<=200)
			System.out.print("Số tiền :" + (50*dongia1 + 50*dongia2+(sodien-100)*dongia3));
		else 
			System.out.print("Số tiền :" +( 50*dongia1 + 50*dongia2+ 100*dongia3+ (sodien-200)*dongia4));
		
		
	}
	

}
