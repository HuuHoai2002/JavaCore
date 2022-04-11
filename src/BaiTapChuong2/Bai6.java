package BaiTapChuong2;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhập vào một số : ");
			n = scanner.nextInt();
		} while (n < 0);
		
		long gt = 1;
		
		for (int i = 1; i <= n; i++) {
			gt *= i;
		}
		System.out.println(n + "! = " + gt);
		scanner.close();
	}

}
