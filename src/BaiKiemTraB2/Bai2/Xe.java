package BaiKiemTraB2.Bai2;

import java.util.Scanner;

public class Xe {
  protected String maXe;
  protected String tenHang;
  protected double giaTien;

  Scanner sc = new Scanner(System.in);

  public void Nhap() {
    System.out.println("Nhap ma xe: ");
    maXe = sc.nextLine();
    System.out.println("Nhap ten hang: ");
    tenHang = sc.nextLine();
    System.out.println("Nhap gia tien: ");
    giaTien = Double.parseDouble(sc.nextLine());
  }

  public void Xuat() {
    System.out.println("Ma xe: " + this.maXe);
    System.out.println("Ten hang " + this.tenHang);
    System.out.println("Gia tien: " + this.giaTien);
  }
}
