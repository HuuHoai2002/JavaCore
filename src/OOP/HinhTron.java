package OOP;

import java.util.Scanner;

class TinhHinhtron {
	double r;
	final float PI = 3.14f;
	
	public TinhHinhtron() {}
	public TinhHinhtron(double r) { this.r = r; }
	
	public void Nhap() {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("\nNhập vào bán kính của hình tròn: ");
			r = scanner.nextDouble();
		} while (r == 0);
		scanner.close();
	}
	
	public double DienTich() {
		return PI * r * r;
	}
	
	public double ChuVi() {
		return 2 * PI * r;
	}
	
	public void Xuat() {
		System.err.println("Chu vi hình tròn là: " + ChuVi());
		System.err.println("Diện tích hình tròn là: " + DienTich());
	}
}
public class HinhTron {
	public static void main(String[] args) {
		TinhHinhtron obj1 = new TinhHinhtron(8);
		System.out.println("Khởi tạo với r = 8");
		obj1.Xuat();
		TinhHinhtron obj2 = new TinhHinhtron();
		obj2.Nhap();
		obj2.Xuat();
	}
}
