package BaiTapChuong5.Bai1;

import java.util.Scanner;

public class Bai1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao chuoi so nguyen bat ky: ");
    try {
      String chuoi = sc.nextLine();
      int so = Integer.parseInt(chuoi);
      System.out.println("Chuyen doi sang so nguyen thanh cong : " + so);
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
    sc.close();
  }
}
