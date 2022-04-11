package BaiTapChuong2;

import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		do {
			System.out.println("Nhập vào 1 chuỗi : ");
			str = scanner.nextLine();
		} while (str.length() > 80);
		System.out.println("Nhập vào 1 ký tự bất kỳ : ");
		String c = scanner.nextLine();
		int dem = 0;
		for(int i = 0; i < str.length(); i++) {
			// Ép kiểu char => string
			if(Character.toString(str.charAt(i)).equals(c)) {
				dem++;
			}
		}
		System.out.println("Số lần xuất hiện của " + c + " trong chuỗi là : " + dem);
		scanner.close();
	}

}
