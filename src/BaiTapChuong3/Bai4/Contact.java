package BaiTapChuong3.Bai4;

import java.util.Scanner;

public abstract class Contact {
  String ten;
  String soDienThoai;
  Scanner sc = new Scanner(System.in);

  abstract void NhapContact();

  abstract void XuatContact();
}
