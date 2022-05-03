package BaiTapChuong4;

import java.util.ArrayList;
import java.util.Scanner;

//Nghiêm Hữu Hoài , msv: 2021050273
public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrIntegers = new ArrayList<>();
		System.out.println("Nhập vào số phần tử: ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập vào phần tử thứ " + (i + 1) + " : ");
			int phanTu = scanner.nextInt();
			arrIntegers.add(phanTu);
		}
		int max = arrIntegers.get(0);
		for (Integer integer : arrIntegers) {
			if (max < integer) {
				max = integer;
			}
		}
		System.out.println("Phần tử có giá trị lớn nhất là : " + max);
		System.out.println("Nhập vào số cần xóa: ");
		int soCanXoa = scanner.nextInt();
		ArrayList<Integer> listDelete = new ArrayList<>();
		for (int i = 0; i < arrIntegers.size(); i++) {
			if (arrIntegers.get(i) == soCanXoa) {
				listDelete.add(soCanXoa); // Lưu lại giá trị (số lần xuất hiện vào mảng mới)
			}
		}
		// Loại bỏ tất cả phần tử của arrIntegers có ở trong listDelete
		arrIntegers.removeAll(listDelete);
		for (Integer integer : arrIntegers) {
			for (Integer integer2 : arrIntegers) {
				if (integer > integer2) {
					int temp = integer;
					integer = integer2;
					integer2 = temp;

				}
			}
		}
		System.out.println("Số phần tử còn lại sau khi xóa và xắp xếp là : ");
		for (Integer integer : arrIntegers) {
			System.out.print(integer + " ");
		}
		scanner.close();
	}
}
