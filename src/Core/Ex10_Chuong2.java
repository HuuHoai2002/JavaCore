package Core;

import java.util.Scanner;

public class Ex10_Chuong2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên : ");
		String name = scanner.nextLine();
		System.out.print("Nhập tuổi : ");
		int age = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập địa chỉ : ");
		String address = scanner.nextLine();
		System.out.println("Thông tin vừa nhập là : ");
		System.out.println("Tên : " + name + "\rTuổi : " + age + "\rĐịa chỉ : " + address);
		scanner.close();
	}
}
