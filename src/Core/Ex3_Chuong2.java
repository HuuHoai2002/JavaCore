package Core;

import java.util.Scanner;

public class Ex3_Chuong2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 1 số từ 0 => 6 : ");
		int n = sc.nextInt();
		switch (n) {
			case 0: {
				System.out.println("Chủ Nhật");
				break;
			}
			case 1: {
				System.out.println("Thứ 2");
				break;
			}
			case 2: {
				System.out.println("Thứ 3");
				break;
			}
			case 3: {
				System.out.println("Thứ 4");
				break;
			}
			case 4: {
				System.out.println("Thứ 5");
				break;
			}
			case 5: {
				System.out.println("Thứ 6");
				break;
			}
			case 6: {
				System.out.println("Thứ 7");
				break;
			}
			default:
				System.out.println("Không có thứ nào thỏa mãn với case = " + n);
		}
		sc.close();
	}

}
