package BaiTapChuong3.Bai3;

public class SinhVien extends MonHoc {
  private int soMonHoc;
  private double tongDiem;
  // Mỗi sinh viên sẽ có 1 mảng các môn học được nhập từ bàn phím
  private SinhVien arrMonHoc[];

  public int getTongSoMonHoc() {
    return this.soMonHoc;
  }

  public void Nhap() {
    System.out.println("Nhap vao thong tin sinh vien: ");
    super.Nhap(); // Gọi đến pt Nhap của lớp Nguoi
    System.out.println("Ban co bao nhieu mon hoc: ");
    soMonHoc = Integer.parseInt(sc.nextLine());
    arrMonHoc = new SinhVien[soMonHoc];
    for (int i = 0; i < soMonHoc; i++) {
      System.out.println("Nhap vao diem cua mon hoc thu : " + (i + 1));
      arrMonHoc[i] = new SinhVien();
      arrMonHoc[i].NhapMonHoc(); // Gọi đến pt Nhap của lớp MonHoc
      tongDiem += arrMonHoc[i].diemMonHoc;
      System.out.println();
    }
  }

  public void Xuat() {
    System.out.println("Thong tin sinh vien:");
    super.Xuat();
    for (int i = 0; i < soMonHoc; i++) {
      System.out.println("Diem hoc phan thu : " + (i + 1) + " cua sinh vien la: ");
      arrMonHoc[i].XuatMonHoc();
    }
    System.out.println("Diem trung binh cac mon hoc la: " + DiemTrungBinh());
    System.out.println();
  }

  public double DiemTrungBinh() {
    return this.tongDiem / this.soMonHoc;
  }
}
