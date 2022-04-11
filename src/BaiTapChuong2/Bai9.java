package BaiTapChuong2;

import java.util.Scanner;

public class Bai9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào một chuỗi : ");
		String str = scanner.nextLine();
		int demStrUpper = 0 , demStrLower = 0, demNumber = 0;
		for(int i = 0; i < str.length(); i++) {
			// ascii : a->z (97->122)
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				demStrLower++;
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') { // ascii : A->Z (65->90)
				demStrUpper++;
			} else {
				if(str.charAt(i) >= '0' && str.charAt(i) <= '9') { // ascii : 0->9 (48->57)
					demNumber++;
				}
			}
		}
		System.out.println("Số lượng kí tự thường có trong chuỗi là : " + demStrLower);
		System.out.println("Số lượng kí tự HOA có trong chuỗi là : " + demStrUpper);
		System.out.println("Số lượng số có trong chuỗi là : " + demNumber);
		scanner.close();
	}
}
