package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Number {
	private int number;
	
	public int getNumber() {
		return number;
	}
	public void Nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào  số: ");
		number = scanner.nextInt();
		scanner.close();
	}
	public void Xuat() {
		System.out.println("Number: " + number);
	}
}
public class Array_List {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào n: ");
		int n = scanner.nextInt();
		List<Number> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập vào số thứ " + (i + 1));
			Number nb = new Number();
			nb.Nhap();
			list.add(nb);
		}
		for (Number number : list) {
			number.Xuat();
		}
		System.out.println("Nhập vào số cần xóa: ");
		int so = scanner.nextInt();
		int index = -1;
		for (int i = 0; i < n; i++) {
			if(list.get(i).getNumber() == so) {
				index = i;
			}
		}
		if(index >= 0) {
			System.out.println(index);
			list.remove(index);
			for (Number number : list) {
				number.Xuat();
			}
		}
		scanner.close();
	}
}
