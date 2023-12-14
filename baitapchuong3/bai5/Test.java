package baitapchuong3.bai5;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		SinhVien sinhvien = new SinhVien();
		Truong truong = new Truong();
		sinhvien.setTen(sn.nextLine());
		sinhvien.setTuoi(sn.nextInt());
		sn.nextLine();
		sinhvien.setGioitinh(sn.nextLine());
		sinhvien.setLop(sn.nextLine());
		sinhvien.setNganh(sn.nextLine());
		truong.setTen(sn.nextLine());
		truong.setHieuTruong(sn.nextLine());
		truong.setDiaChi(sn.nextLine());
		sinhvien.setTruong(truong);
		System.out.print(sinhvien);
		sn.close();

	}

}
