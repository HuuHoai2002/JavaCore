package BaiTapChuong3.Test;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      try {
        System.out.println("Nhập vào họ tên của bạn: ");
        int name = sc.nextInt();
        System.out.println("Tên của mày là :" + name);
        break;
      } catch (Exception e) {
        System.out.println("Tên phải là 1 chuỗi ký tự , vui lòng nhập lại");
      }
    }
    sc.close();
  }
}
