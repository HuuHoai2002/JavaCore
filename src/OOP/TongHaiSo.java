package OOP;

import java.util.Scanner;

class TinhTongHaiSo {
	double a , b;
	public TinhTongHaiSo() {
		
	}
	public TinhTongHaiSo(double a , double b) {
		this.a = a;
		this.b = b;
	}
	public void Nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập a: ");
		a = scanner.nextDouble();
		System.out.println("Nhập b: ");
		b = scanner.nextDouble();
		scanner.close();
	}
	double Tong() {
		return a + b;
	}
 	public void Xuat() {
		System.err.println("Tổng của 2 số " + a + " và " + b + " là : " + Tong());
	}
}
public class TongHaiSo {
	public static void main(String[] args) {
		TinhTongHaiSo so1 = new TinhTongHaiSo(100, 500);
		so1.Xuat();
		TinhTongHaiSo so2 = new TinhTongHaiSo();
		so2.Nhap();
		so2.Xuat();
	}
}
