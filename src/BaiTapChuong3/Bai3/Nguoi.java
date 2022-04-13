package BaiTapChuong3.Bai3;

import java.util.Scanner;

public class Nguoi {
  protected String hoTen;
  protected int namSinh;
  Scanner sc = new Scanner(System.in);

  public void Nhap() {
    System.out.println("Nhap vao ho ten: ");
    hoTen = sc.nextLine();
    System.out.println("Nhap vao nam sinh: ");
    namSinh = Integer.parseInt(sc.nextLine());
  }

  public void Xuat() {
    System.out.println("Ten: " + this.hoTen);
    System.out.println("Nam Sinh: " + this.namSinh);
  }
}
