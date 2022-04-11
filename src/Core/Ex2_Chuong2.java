package Core;

public class Ex2_Chuong2 {

	public static void main(String[] args) {
		int a = 2002 , b = 999;
		
		System.out.println(
				"Số nhỏ nhất trong 2 số " + a + " và " + b + " là : " + (a < b ? a : b)
		);
		/*
		 * Hoặc
		 int min = a;
		 
		 if(min > b) {
		 	min = b;
		 }
		 System.out.println("Số nhỏ nhất trong 2 số " + a + " và " + b + " là : " + min);
		 */
	}
}
