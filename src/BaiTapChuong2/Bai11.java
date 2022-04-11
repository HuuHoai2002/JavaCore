package BaiTapChuong2;

import java.util.Scanner;

public class Bai11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mảng : ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập a[" + (i + 1) + "]: ");
			arr[i] = scanner.nextInt();
		}
		System.out.println("Mảng ban đầu là : ");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Mảng sau khi sắp xếp là : ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
		scanner.close();
	}

}
