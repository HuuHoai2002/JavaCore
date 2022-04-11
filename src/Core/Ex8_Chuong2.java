package Core;

import java.util.Scanner;
                             
public class Ex8_Chuong2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sumArray = 0;
		System.out.println("Nhập vào số lượng phần tử của mảng : ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử arr[" + (i + 1) + "]: ");
			arr[i] = scanner.nextInt();
		}
		for (int i : arr) {
			sumArray += (i % 2 == 0 ? i : 0);
		}
		System.out.println("Tổng các số chẵn của mảng là : " + sumArray);
		scanner.close(); 
	}
}
