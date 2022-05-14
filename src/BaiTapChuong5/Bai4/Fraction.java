package BaiTapChuong5.Bai4;

import java.util.Scanner;

public class Fraction {
  static void KiemTraPhanSo(int tu, int mau) throws FractionException {
    if (mau == 0) {
      throw new FractionException("Mau phai la 1 so nguyen khac 0");
    } else {
      double ps = tu / mau;
      System.out.println(tu + " / " + mau + " = " + ps);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao tu so: ");
    int tu = sc.nextInt();
    System.out.println("Nhap vao mau so: ");
    int mau = sc.nextInt();
    try {
      KiemTraPhanSo(tu, mau);
    } catch (FractionException e) {
      e.printStackTrace();
    }
    sc.close();
  }
}