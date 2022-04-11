package BaiTapChuong2;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập a : ");
		int a = scanner.nextInt();
		System.out.println("Nhập b : ");
		int b = scanner.nextInt();
		System.out.println("Tổng của " + a + " và " + b + " là : " + (a + b));
		System.out.println("Hiệu của " + a + " và " + b + " là : " + (a - b));
		System.out.println("Tích của " + a + " và " + b + " là : " + (a * b));
		System.out.println("Thương của " + a + " và " + b + " là : " + (a / b));
		System.out.println("Chia lấy dư " + a + " và " + b + " là : " + (a % b));
		if(a > b) {
			System.out.println("A lớn hơn B");
		} else if(a == b) {
			System.out.println("Hai số bằng nhau");
		} else {
			System.out.println("A nhỏ hơn B");
		}
		scanner.close();
	}
}
