package OOP.BaiTapAbstract;

import java.util.Scanner;

class Dinh {
  double x, y;

  Scanner sc = new Scanner(System.in);

  public void Nhap() {
    System.out.println("Nhap vao x: ");
    this.x = sc.nextDouble();
    System.out.println("Nhap vao y: ");
    this.y = sc.nextDouble();
  }

  public void Xuat() {
    System.out.println("Dinh x = " + this.x);
    System.out.println("Dinh y = " + this.y);
  }
}

abstract class TuGiac {
  Dinh dinhA = new Dinh();
  Dinh dinhB = new Dinh();
  Dinh dinhC = new Dinh();
  Dinh dinhD = new Dinh();

  Double chuvi, dientich;

  public void NhapTT() {
    dinhA.Nhap();
    dinhB.Nhap();
    dinhC.Nhap();
    dinhD.Nhap();
  }

  public void InTT() {
    dinhA.Xuat();
    dinhB.Xuat();
    dinhC.Xuat();
    dinhD.Xuat();
    System.out.println("Chu vi: " + TinhChuVi());
    System.out.println("Dien tich: " + TinhDienTich());
  }

  abstract double TinhChuVi();

  abstract double TinhDienTich();
}

class HinhVuong extends TuGiac {
  double doDaiCanh;

  public void TinhDoDaiCanh() {
    doDaiCanh = Math.sqrt((dinhB.x * dinhA.x) + (dinhB.y * dinhA.y));
  }

  @Override
  public double TinhChuVi() {
    return doDaiCanh * 4;
  }

  @Override
  public double TinhDienTich() {
    return doDaiCanh * doDaiCanh;
  }

  @Override
  public void InTT() {
    this.TinhDoDaiCanh();
    super.InTT();
    System.out.println("Do dai canh la : " + this.doDaiCanh);
  }
}

class HinhChuNhat extends TuGiac {
  double chieudai, chieurong;

  void TinhChieuDaiChieuRong() {
    chieudai = Math.sqrt((dinhB.x * dinhA.x) + (dinhB.y * dinhA.y));
    chieurong = Math.sqrt((dinhD.x * dinhC.x) + (dinhD.y * dinhC.y));
  }

  @Override
  public double TinhChuVi() {
    return (this.chieudai + this.chieurong) / 2;
  }

  @Override
  public double TinhDienTich() {
    return (this.chieudai * this.chieurong);
  }

  @Override
  public void InTT() {
    this.TinhChieuDaiChieuRong();
    super.InTT();
    System.out.println("Chieu dai : " + this.chieudai);
    System.out.println("Chieu rong : " + this.chieurong);
  }
}

public class DemoAbtract {
  public static void main(String[] args) {
    TuGiac hv = new HinhVuong();
    hv.NhapTT();
    hv.InTT();
    TuGiac hcn = new HinhChuNhat();
    hcn.NhapTT();
    hcn.InTT();
  }
}
