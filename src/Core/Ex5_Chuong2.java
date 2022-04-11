package Core;

import java.util.Scanner;

public class Ex5_Chuong2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = scanner.nextInt();
		int sumN = 0 , surplus;
		while(n > 0) {
			surplus = n % 10;
			sumN += surplus;
			n /= 10;
		}
		System.out.println("Tổng các chữ số của " + n + " là : " + sumN);
		scanner.close();
	}

}
