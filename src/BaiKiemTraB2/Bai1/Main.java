package BaiKiemTraB2.Bai1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao so luong hoa don: ");
    int n = sc.nextInt();
    HoaDon hd[] = new HoaDon[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Nhap vao hoa don thu: " + (i + 1));
      hd[i] = new HoaDon();
      hd[i].Nhap();
    }

    System.out.println("Thong tin cac hoa don vua nhap la: ");
    for (HoaDon hoaDon : hd) {
      hoaDon.Xuat();
      System.out.println("Tong tien: " + hoaDon.tinhTien());
      System.out.println();
    }
    sc.close();
  }
}
