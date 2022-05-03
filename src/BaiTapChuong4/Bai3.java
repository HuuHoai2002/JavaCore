package BaiTapChuong4;

import java.util.LinkedList;
import java.util.Scanner;

import javax.print.attribute.standard.PagesPerMinute;

//Nghiêm Hữu Hoài , msv: 2021050273
class SinhVien {
	private String hoTen;

	public String getHoTen() {
		return this.hoTen;
	}

	public double getDiemThi() {
		return this.diemThi;
	}

	private double diemThi;
	Scanner scanner = new Scanner(System.in);

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setDiemThi(double diemThi) {
		this.diemThi = diemThi;
	}

	public void Xuat() {
		System.out.println("Tên : " + this.hoTen);
		System.out.println("Điểm thi : " + this.diemThi);
	}
}

public class Bai3 {

	public static void main(String[] args) {
		LinkedList<SinhVien> linkedListSinhVien = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		System.err.println("\n\t\tNhập danh sách Sinh Viên");
		while (true) {
			SinhVien sv = new SinhVien();
			System.out.println("Nhập vào họ tên sinh viên: ");
			String name = scanner.nextLine();
			if (name == "") {
				break;
			} else {
				sv.setHoTen(name);
				System.out.println("Nhập vào điểm thi : ");
				double diem = Double.parseDouble(scanner.nextLine());
				sv.setDiemThi(diem);
				linkedListSinhVien.addLast(sv);
			}
		}
		int soSvThiLai = 0;
		for (SinhVien sinhVien : linkedListSinhVien) {
			if (sinhVien.getDiemThi() <= 5) {
				soSvThiLai++;
			}
		}
		System.err.println("Số sinh viên phải thi lại là : " + soSvThiLai);
		for (SinhVien sinhVien : linkedListSinhVien) {
			if (sinhVien.getDiemThi() <= 5) {
				sinhVien.Xuat();
			}
		}
		SinhVien maxDiemSinhVien = linkedListSinhVien.get(0);
		for (int i = 1; i < linkedListSinhVien.size(); i++) {
			if (maxDiemSinhVien.getDiemThi() <= linkedListSinhVien.get(i).getDiemThi()) {
				maxDiemSinhVien = linkedListSinhVien.get(i);
			}
		}
		System.err.println("Số sinh viên có điểm thi cao nhất là : ");
		for (int i = 0; i < linkedListSinhVien.size(); i++) {
			if (maxDiemSinhVien.getDiemThi() <= linkedListSinhVien.get(i).getDiemThi()) {
				linkedListSinhVien.get(i).Xuat();
			}
		}
		System.out.println("Nhập vào tên sinh viên cần tìm : ");
		String name = scanner.nextLine();
		System.out.println("Những sinh viên có tên " + name + " là : ");
		for (int i = 0; i < linkedListSinhVien.size(); i++) {
			if(linkedListSinhVien.get(i).getHoTen().equalsIgnoreCase(name)) {
				linkedListSinhVien.get(i).Xuat();
			}
		}
		scanner.close();
	}
}
