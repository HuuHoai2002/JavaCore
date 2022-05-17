package BaiKiemTraB2.Bai2;

import java.util.Scanner;

public class XeMay extends Xe {
  private int phanKhoiXe;
  Scanner sc = new Scanner(System.in);

  public void Nhap() {
    super.Nhap();
    System.out.println("Nhao vao phan khoi xe: ");
    do {
      phanKhoiXe = sc.nextInt();
    } while (phanKhoiXe <= 0);
  }

  public void Xuat() {
    super.Xuat();
    System.out.println("Phan khoi: " + this.phanKhoiXe);
  }

  public int getPhanKhoiXe() {
    return this.phanKhoiXe;
  }
}
