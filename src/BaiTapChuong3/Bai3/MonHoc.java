package BaiTapChuong3.Bai3;

public class MonHoc extends Nguoi {
  protected String maMonHoc;
  protected String tenMonHoc;
  protected double diemMonHoc;

  public void NhapMonHoc() {
    System.out.println("Nhap vao ma mon hoc: ");
    maMonHoc = sc.nextLine();
    System.out.println("Nhap vao ten mon hoc: ");
    tenMonHoc = sc.nextLine();
    System.out.println("Nhap vao diem mon hoc: ");
    diemMonHoc = Double.parseDouble(sc.nextLine());
  }

  public void XuatMonHoc() {
    System.out.println("Diem: " + this.diemMonHoc);
  }
}
