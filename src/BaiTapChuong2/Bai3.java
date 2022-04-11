package BaiTapChuong2;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		String name = scanner.nextLine();
		System.out.println("Nhập tuổi: ");
		int age = scanner.nextInt();
		
		if(age < 16) {
			System.out.println("Bạn " + name + " ở độ tuổi vị thành niên");
		} else if(age >= 16 && age < 18) {
			System.out.println("Bạn " + name + " ở độ tuổi trưởng thành");
		} else {
			System.out.println("Bạn " + name + " đã già");
		}
		scanner.close();
	}

}
