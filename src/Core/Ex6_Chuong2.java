package Core;

import java.util.Scanner;

public class Ex6_Chuong2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sumN = 0;
		do {
			System.out.println("Nhập vào 1 số : ");
			int n = scanner.nextInt();
			sumN += n;
		} while (sumN < 100);
		System.out.println("Tổng: " + sumN);
		scanner.close();
	}

}
