package baitapchuong3.bai4;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		BenhVien benhvien = new BenhVien();
		BenhNhan benhnhan=new BenhNhan();
		benhnhan.setTen(sn.nextLine());
		benhnhan.setTuoi(sn.nextInt());
		sn.nextLine();
		benhnhan.setGioitinh(sn.nextLine());
		benhnhan.setTiensu(sn.nextLine());
		benhnhan.setChuandoan(sn.nextLine());
		benhvien.setTen(sn.nextLine());
		benhvien.setGiamDoc(sn.nextLine());
		benhvien.setDiaChi(sn.nextLine());
		benhnhan.setBenhVien(benhvien);
		System.out.print(benhnhan);
		sn.close();
		
	}

}
