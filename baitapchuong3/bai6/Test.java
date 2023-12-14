package baitapchuong3.bai6;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		PartTimeEmployee nhanvien = new PartTimeEmployee();
		nhanvien.setName(sn.nextLine());
		nhanvien.setAge(sn.nextInt());
		sn.nextLine();
		nhanvien.setGender(sn.nextLine());
		nhanvien.setEmployerName(sn.nextLine());
		nhanvien.setDateHired(sn.nextLine());
		nhanvien.setHoursPerWeek(sn.nextInt());
		System.out.print(nhanvien);
		sn.close();
	}

}
