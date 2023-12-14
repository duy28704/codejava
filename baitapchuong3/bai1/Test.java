package baitapchuong3.bai1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Person Duy= new Person();
		Duy.setName(sn.nextLine());
		Duy.setDob(sn.nextLine());
		Duy.setPob(sn.nextLine());
		Duy.setGender(sn.nextLine());
		Duy.setEmail(sn.nextLine());
		Duy.setPhone(sn.nextLine());
		System.out.print(Duy);
		sn.close();
	}
}
