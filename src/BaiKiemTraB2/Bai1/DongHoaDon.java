package BaiKiemTraB2.Bai1;

import java.util.Scanner;

public class DongHoaDon extends HoaDon {
  private String tenNhaCungCap;
  private String ngayLap;

  Scanner sc = new Scanner(System.in);

  public void Nhap() {
    super.Nhap();
    System.out.println("Nhap vao ten nha cung cap");
    tenNhaCungCap = sc.nextLine();
    System.out.println("Nhap vao ngay lap: ");
    ngayLap = sc.nextLine();
  }

  public void Xuat() {
    super.Xuat();
    System.out.println("Ten nha cung cap: " + tenNhaCungCap);
    System.out.println("Ngay lap: " + ngayLap);
  }
}
