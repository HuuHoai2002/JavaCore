package OOP;

import java.util.Scanner;

class SV {
	String hoTen;
	double diemTB;

	public SV() {

	}

	public SV(String hoTen, double diemTB) {
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}

	public void Nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào tên sinh viên: ");
		hoTen = scanner.nextLine();
		do {
			System.out.println("Nhập vào điểm của sinh viên: ");
			diemTB = Double.parseDouble(scanner.nextLine());
		} while (diemTB > 10);
		scanner.close();
	}

	public String XepLoai() {
		if (diemTB < 5) {
			return " xếp loại yếu";
		} else if (diemTB >= 5 && diemTB < 6.5) {
			return " xếp loại trung bình";
		} else if (diemTB >= 6.5 && diemTB < 8.5) {
			return " xếp loại khá";
		}
		return " xếp loại giỏi";
	}

	public void Xuat() {
		System.err.println("Sinh viên " + hoTen + XepLoai());
	}
}

public class SinhVien {
	public static void main(String[] args) {
		SV sv1 = new SV("Nghiêm Hữu Hoài", 10);
		sv1.Xuat();
		// SV sv2 = new SV();
		// sv2.Nhap();
		// sv2.Xuat();
	}
}
