package Core;

import java.util.Scanner;

public class Ex9_Chuong2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số hàng : ");
		int m = scanner.nextInt();
		System.out.println("Nhập vào số cột : ");
		int n = scanner.nextInt();
		int arr[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Nhập phần tử arr[" + i + "][" + j + "] : ");
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Ma trận vừa nhập là : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int max = arr[0][0];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		System.out.println("Số lớn nhất trong mảng là : " + max);
		scanner.close();
	}
}
