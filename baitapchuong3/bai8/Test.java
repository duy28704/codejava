package baitapchuong3.bai8;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Rectangle vuong = new Rectangle();
		Triangle tamgiac = new Triangle();
		vuong.setColor(sn.nextLine());
		vuong.setLength(sn.nextInt());
		vuong.setWidth(sn.nextInt());
		sn.nextLine();
		tamgiac.setColor(sn.nextLine());
		tamgiac.setBase(sn.nextInt());
		tamgiac.setHeight(sn.nextInt());
		System.out.println(vuong);
		System.out.print(tamgiac);
		sn.close();

	}

}
