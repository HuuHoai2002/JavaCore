package BaiTapChuong4;

import java.util.Scanner;
import java.util.TreeMap;

//Nghiêm Hữu Hoài , msv: 2021050273
class SinhVien2 {
	private String maSv;
	private String hoTen;
	private String lop;
	Scanner scanner = new Scanner(System.in);
	public String getMaSv() {
		return maSv;
	}
	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	
	public void Nhap() {
		System.out.println("Nhập vào mã sinh viên: ");
		maSv = scanner.nextLine();
		System.out.println("Nhập vào họ tên: ");
		hoTen = scanner.nextLine();
		System.out.println("Nhập vào lớp: ");
		lop = scanner.nextLine();
	}
	public void Xuat() {
		System.err.println("Mã sinh viên: " + maSv);
		System.err.println("Tên: " + hoTen);
		System.err.println("Lớp: " + lop);
	}
}
public class Bai5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeMap<String, SinhVien2> mapSinhVien = new TreeMap<>();
		
		System.out.println("Nhập vào số sinh viên: ");
		int n = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập vào sinh viên thứ: " + ( i + 1));
			SinhVien2 sv = new SinhVien2();
			int thuTu = i + 1;
			sv.Nhap();
			mapSinhVien.put("sv" + thuTu, sv); // theo key: value
		}
		System.out.println("Nhập vào 1 lớp: ");
		String tenLop = scanner.nextLine();
		System.out.println("Tất cả các sinh viên có trong lớp " + tenLop + " là: ");
		for(int i = 0; i < n; i++) {
			if(mapSinhVien.get("sv" + (i + 1)).getLop() == tenLop) {
				System.out.println("đúng");
				mapSinhVien.get("sv" + (i + 1)).Xuat();
			}
		}
		System.out.println("Nhập vào mã sinh viên: ");
		String masv = scanner.nextLine();
		System.out.println("Tất cả các sinh viên có mã sinh viên " + masv + " là: ");
		for(int i = 0; i < n; i++) {
			if(mapSinhVien.get("sv" + (i + 1)).getMaSv() == masv) {
				System.out.println("đúng");
				mapSinhVien.get("sv" + (i + 1)).Xuat();
			}
		}
		scanner.close();
	}

}
