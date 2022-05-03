package BaiTapChuong4;

import java.util.LinkedList;
import java.util.Scanner;

//Nghiêm Hữu Hoài , msv: 2021050273
public class Bai2 {
	public static void main(String[] args) {
		LinkedList<Integer> linkeListIntegers = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập n : ");
		int n = scanner.nextInt();
		double sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập vào giá trị thứ " + (i + 1) + " : ");
			int so = scanner.nextInt();
			linkeListIntegers.add(so);
		}
		for (Integer integer : linkeListIntegers) {
			if (integer % 2 == 0) {
				sum += integer;
			}
		}
		System.out.println("Trung bình cộng các số chẵn là : " + (sum / n));
		scanner.close();
	}
}
