package baitapchuong3.bai3;
import baitapchuong3.bai2.Address;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		Address address = new Address();
		Nhanvien Nhanvien= new Nhanvien("",address,"","");
		Nhanvien.setName(sn.nextLine());
		Nhanvien.setDob(sn.nextLine());
		Nhanvien.setGender(sn.nextLine());
		address.setThon(sn.nextLine());
		address.setXa(sn.nextLine());
		address.setHuyen(sn.nextLine());
		address.setTinh(sn.nextLine());
		System.out.print(Nhanvien);
		sn.close();
	}
}
