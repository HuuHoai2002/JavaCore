package BaiKiemTraB2.Bai2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao so luong xe may ");
    int n = sc.nextInt();
    XeMay xm[] = new XeMay[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Nhap thong tin xe may thu: " + (i + 1));
      xm[i] = new XeMay();
      xm[i].Nhap();
    }
    XeMay temp = new XeMay();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (xm[i].getPhanKhoiXe() < xm[j].getPhanKhoiXe()) {
          temp = xm[i];
          xm[i] = xm[j];
          xm[j] = temp;
        }
      }
    }
    System.out.println("Phan khoi giam dan la: ");
    for (XeMay xeMay : xm) {
      xeMay.Xuat();
    }
    sc.close();
  }
}
