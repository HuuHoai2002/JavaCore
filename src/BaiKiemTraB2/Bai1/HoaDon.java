package BaiKiemTraB2.Bai1;

import java.util.Scanner;

public class HoaDon {
	protected String soHoaDon;
	protected String ngayBan;
	protected String tenHang;
	protected int soLuong;
	protected double giaBan;
	Scanner scanner = new Scanner(System.in);

	public void Nhap() {
		System.out.println("Nhap vao so hoa don: ");
		soHoaDon = scanner.nextLine();
		System.out.println("Nhap vao ngay ban: ");
		ngayBan = scanner.nextLine();
		System.out.println("Nhap vao ten hang: ");
		tenHang = scanner.nextLine();
		try {
			System.out.println("Nhap vao so luong: ");
			soLuong = Integer.parseInt(scanner.nextLine());
			System.out.println("Nhap vao gia ban: ");
			giaBan = Double.parseDouble(scanner.nextLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public void Xuat() {
		System.out.println("So hoa don: " + soHoaDon);
		System.out.println("Ngay ban: " + ngayBan);
		System.out.println("Ten hang: " + tenHang);
		System.out.println("So luong: " + soLuong);
		System.out.println("Gia ban: " + giaBan);
	}

	public double tinhTien() {
		return this.soLuong * this.giaBan;
	}
}
