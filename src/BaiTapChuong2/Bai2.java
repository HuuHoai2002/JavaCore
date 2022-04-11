package BaiTapChuong2;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào 1 số : ");
		int n = scanner.nextInt();
		System.out.println("Số vừa nhập vào là số " + (n % 2 == 0 ? "chẵn" : "lẻ"));
		scanner.close();
	}

}
