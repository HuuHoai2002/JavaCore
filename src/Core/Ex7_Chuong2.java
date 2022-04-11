package Core;

import java.util.Scanner;

public class Ex7_Chuong2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số lượng phần tử của mảng : ");
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập a[" + (i + 1) + "]: ");
			a[i] = scanner.nextInt();
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
		scanner.close();
	}
}
