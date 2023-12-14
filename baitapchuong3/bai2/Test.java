package baitapchuong3.bai2;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sn  = new Scanner(System.in);
		Address Duy = new Address();
		Duy.setThon(sn.nextLine());
		Duy.setXa(sn.nextLine());
		Duy.setHuyen(sn.nextLine());
		Duy.setTinh(sn.nextLine());
		System.out.print(Duy);
		sn.close();
		
		
		
	}

}
