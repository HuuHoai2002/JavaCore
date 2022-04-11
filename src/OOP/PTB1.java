package OOP;

import java.util.Scanner;

class GiaiPTB1 {
	private double a , b;
	
	public GiaiPTB1() {
		
	}
	public GiaiPTB1(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public void Nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập a (a > 0): ");
		a = scanner.nextDouble();
		System.out.println("Nhập b: ");
		b = scanner.nextDouble();
		scanner.close();
	}
	public void Xuat() {
		if(b > 0 && a != 0) {
			System.err.printf("%.2f" + "x" + " + " + "%.2f" + " = 0 => x = %.2f \n",a,b,(-b / a));
		} else if(b == 0 && a != 0) {
			System.err.printf("%.2f" + "x" + " = 0 => x = 0 \n",a);
		} else if(a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else if(a == 0 && b == 0) {
			System.out.println("Phương trình vô số nghiệm");
		} else {
			System.err.printf("%.2f" + "x" + " - " + "%.2f" + " = 0 => x = %.2f \n",a,(-b),(-b / a));
		}
	}
}
public class PTB1 {
	public static void main(String[] args) {
		GiaiPTB1 obj1 = new GiaiPTB1(3 , 2);
		obj1.Xuat();
		GiaiPTB1 obj2 = new GiaiPTB1();
		obj2.Nhap();
		obj2.Xuat();
	}                       
}