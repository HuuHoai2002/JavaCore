package BaiTapChuong3.Bai3;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao so sinh vien: ");
    int sosv = Integer.parseInt(sc.nextLine());

    SinhVien arrSinhVien[] = new SinhVien[sosv];

    for (int i = 0; i < sosv; i++) {
      System.out.println("Nhap thong tin cho sinh vien thu: " + (i + 1));
      arrSinhVien[i] = new SinhVien();
      arrSinhVien[i].Nhap();
    }
    System.out.println("Thong tin vua nhap la: \n");
    for (SinhVien sinhVien : arrSinhVien) {
      sinhVien.Xuat();
    }
    SinhVien SvMaxDiem = arrSinhVien[0];
    for (int i = 0; i < sosv; i++) {
      if (SvMaxDiem.DiemTrungBinh() < arrSinhVien[i].DiemTrungBinh()) {
        SvMaxDiem = arrSinhVien[i];
      }
    }
    System.err.println("Sinh vien co diem trung binh cao nhat la: \n");
    SvMaxDiem.Xuat();

    System.out.println("Xap xep theo diem trung binh giam dan la: \n");
    SinhVien temp = new SinhVien();
    for (int i = 0; i < sosv - 1; i++) {
      for (int j = i + 1; j < sosv; j++) {
        if (arrSinhVien[i].DiemTrungBinh() < arrSinhVien[j].DiemTrungBinh()) {
          temp = arrSinhVien[i];
          arrSinhVien[i] = arrSinhVien[j];
          arrSinhVien[j] = temp;
        }
      }
    }
    for (SinhVien sinhVien : arrSinhVien) {
      sinhVien.Xuat();
    }
    sc.close();
  }
}
