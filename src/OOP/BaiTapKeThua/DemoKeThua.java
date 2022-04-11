package OOP.BaiTapKeThua;

import java.util.Scanner;

class Person {
  String ten, gioitinh;
  int tuoi;

  Scanner sc = new Scanner(System.in);

  public void Nhap() {
    System.out.println("Nhap vao ten : ");
    this.ten = sc.nextLine();
    System.out.println("Nhap vao tuoi : ");
    this.tuoi = Integer.parseInt(sc.nextLine());
    System.out.println("Nhap vao gioi tinh : ");
    this.gioitinh = sc.nextLine();
  }

  public String toString() {
    return "{" +
        " ten='" + this.ten + "'" +
        ", gioitinh='" + this.gioitinh + "'" +
        ", tuoi='" + this.tuoi + "'" +
        "}";
  }

  public void Xuat() {
    System.out.println("Thong tin vua nhap la : " + toString());
  }
}

class Employee extends Person {
  double tienluongcb, hesoluongcb;

  @Override
  public void Nhap() {
    super.Nhap();
    System.out.println("Nhap ten luong co ban: ");
    this.tienluongcb = sc.nextDouble();
    System.out.println("Nhap he so luong co ban: ");
    this.hesoluongcb = sc.nextDouble();
  }

  @Override
  public void Xuat() {
    super.Xuat();
    System.out.println("Luong: " + this.TinhLuong());
  }

  public double TinhLuong() {
    return this.tienluongcb * this.hesoluongcb;
  }
}

class Manager extends Employee {
  double luongtrachnhiem;

  @Override
  public void Nhap() {
    super.Nhap();
    System.out.println("Nhap luong trach nhiem co ban: ");
    this.luongtrachnhiem = sc.nextDouble();
  }

  @Override
  public void Xuat() {
    super.Xuat();
    // System.out.println("Luong: " + this.TinhLuong());
  }

  @Override
  public double TinhLuong() {
    return super.TinhLuong() + this.luongtrachnhiem;
  }
}

class Student extends Person {
  String masinhvien;

  @Override
  public void Nhap() {
    super.Nhap();
    System.out.println("Nhap vao ma sinh vien: ");
    this.masinhvien = sc.nextLine();
  }

  @Override
  public void Xuat() {
    super.Xuat();
    System.out.println("Ma sinh vien: " + this.masinhvien);
  }
}

class Programmer extends Student {
  int sonamkinhnghiem;

  @Override
  public void Nhap() {
    super.Nhap();
    System.out.println("Nhap vao so nam kinh nghiem: ");
    this.sonamkinhnghiem = sc.nextInt();
  }

  @Override
  public void Xuat() {
    super.Xuat();
    System.out.println("So nam kinh nghiem : " + this.sonamkinhnghiem);
  }
}

public class DemoKeThua {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao so luong Employee: ");
    int n = sc.nextInt();
    Employee arr[] = new Employee[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Nhap thong tin cho Employee thu : " + (i + 1));
      arr[i] = new Employee();
      arr[i].Nhap();
    }
    Employee temp = new Employee();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (arr[i].TinhLuong() < arr[j].TinhLuong()) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println("Sap xep theo tien luong giam dan la : ");
    for (Employee employee : arr) {
      employee.Xuat();
    }
    sc.close();
  }
}
