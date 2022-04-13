package BaiTapChuong3.Bai3;

public class SinhVien extends MonHoc {
  private int tongSoMonHoc;
  private double tongDiem;
  private SinhVien sv[];

  public int getTongSoMonHoc() {
    return this.tongSoMonHoc;
  }

  public void Nhap() {
    System.out.println("Nhap vao thong tin sinh vien: ");
    super.Nhap(); // Nhap cua lop Nguoi
    System.out.println("Ban co bao nhieu mon hoc: ");
    tongSoMonHoc = Integer.parseInt(sc.nextLine());
    sv = new SinhVien[tongSoMonHoc];
    for (int i = 0; i < tongSoMonHoc; i++) {
      System.out.println("Nhap vao diem cua mon hoc thu : " + (i + 1));
      sv[i] = new SinhVien();
      sv[i].NhapMonHoc(); // NhapMonHoc cua lop MonHoc
      tongDiem += sv[i].diemMonHoc;
      System.out.println();
    }
  }

  public void Xuat() {
    System.out.println("Thong tin sinh vien:");
    super.Xuat();
    for (int i = 0; i < tongSoMonHoc; i++) {
      System.out.println("Diem hoc phan thu : " + (i + 1) + " cua sinh vien la: ");
      sv[i].XuatMonHoc();
    }
    System.out.println("Diem trung binh cac mon hoc la: " + DiemTrungBinh());
    System.out.println();
  }

  public double DiemTrungBinh() {
    return this.tongDiem / this.tongSoMonHoc;
  }
}
