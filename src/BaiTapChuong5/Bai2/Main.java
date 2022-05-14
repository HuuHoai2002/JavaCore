package BaiTapChuong5.Bai2;

import java.util.Scanner;

public class Main {
  static public void KiemTraEmail(String chuoi) throws EmailException {
    if (chuoi.indexOf('@') == -1) {
      throw new EmailException("Email phai co '@'");
    }
    if (chuoi.indexOf('@') == 0) {
      throw new EmailException("'@' khong the dung dau");
    }
    if (chuoi.indexOf('@', chuoi.indexOf('@') + 1) != -1) {
      throw new EmailException("Email chi duoc toi da 1 ky tu '@'");
    }
    System.out.println("Email dung dinh dang");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap email: ");
    String chuoi = sc.nextLine();
    try {
      KiemTraEmail(chuoi);
    } catch (EmailException ex) {
      ex.printStackTrace();
    }

    sc.close();
  }
}
