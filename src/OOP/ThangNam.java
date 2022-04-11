package OOP;

import java.util.Scanner;

class NgayThangNam {
	int nam, thang;

	public void Nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào năm: ");
		nam = scanner.nextInt();
		do {
			System.out.println("Nhập vào tháng: ");
			thang = scanner.nextInt();
		} while (thang > 12);
		scanner.close();
	}

	public void Tinh() {
		if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
			System.out.println("Tháng " + thang + " năm " + nam + " có 31 ngày.");
		} else {
			System.out.println("Tháng " + thang + " năm " + nam + " có 30 ngày.");
		}
	}

	public void Xuat() {
		// năm nhuận ,tháng 2 có 29 ngày
		if (nam % 4 == 0 && nam % 100 != 0) {
			if (thang == 2) {
				System.out.println("Tháng " + thang + " năm " + nam + " có 29 ngày.");
			} else {
				Tinh();
			}
		} else {
			if (thang == 2) {
				System.out.println("Tháng " + thang + " năm " + nam + " có 28 ngày.");
			} else {
				Tinh();
			}
		}
	}
}

public class ThangNam {
	public static void main(String[] args) {
		NgayThangNam obj1 = new NgayThangNam();
		obj1.Nhap();
		obj1.Xuat();
	}
}
