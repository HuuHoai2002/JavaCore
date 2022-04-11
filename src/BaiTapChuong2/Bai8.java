package BaiTapChuong2;

import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số lượng phần tử của dãy : ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ arr[" + (i + 1) + "]:");
			arr[i] = scanner.nextInt();
		}
		double sumArr = 0;
		for(int i : arr) {
			sumArr += i;
		}
		System.out.println("Trung bình cộng của dãy đã nhập là : " + (double)(sumArr / n));
		scanner.close();
	}

}
