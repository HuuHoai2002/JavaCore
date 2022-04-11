package Core;

import java.util.Scanner;

public class Ex4_Chuong2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào điểm của bạn : ");
		
		double diem = scanner.nextDouble();
		
		if(diem < 4) {
			System.out.println("Bạn được điểm F");
		} else if(diem >= 4 && diem < 5) {
			System.out.println("Bạn được điểm D");
		} else if(diem >= 5 && diem < 6.5) {
			System.out.println("Bạn được điểm C");
		} else if(diem >= 6.5 && diem < 8.5) {
			System.out.println("Bạn được điểm B");
		} else {
			System.out.println("Bạn được điểm A");
		}
		scanner.close();
	}
}
