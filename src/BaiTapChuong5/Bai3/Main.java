package BaiTapChuong5.Bai3;

import java.util.Scanner;

public class Main {
  static public void KiemTraSoNguyenDuong(String chuoi) throws UnsignedIntegerException {
    if (chuoi.contains(".")) {
      throw new UnsignedIntegerException("So ban vua nhap khong phai so nguyen");
    }
    int so = Integer.parseInt(chuoi);
    if (so < 0) {
      throw new UnsignedIntegerException("So ban vua nhap khong phai so nguyen duong");
    }
    System.out.println("So vua nhap la so nguyen duong");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao 1 chuoi so nguyen: ");
    String chuoi = sc.nextLine();
    try {
      KiemTraSoNguyenDuong(chuoi);
    } catch (UnsignedIntegerException e) {
      e.printStackTrace();
    }
    sc.close();
  }
}
