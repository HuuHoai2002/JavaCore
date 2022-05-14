package BaiTapChuong5.Bai5;

import java.util.Scanner;

public class Main {
  static int KiemTraSL(int so) {
    int count = 0;
    while (so >= 10) {
      so /= 10;
      count++;
    }
    return count + 1;
  }

  static void KiemTraPIN(String chuoi) throws PINException {
    if (chuoi.contains(".")) {
      throw new PINException("So ban vua nhap khong phai so nguyen");
    }
    int so = Integer.parseInt(chuoi);
    if (KiemTraSL(so) > 4) {
      throw new PINException("Ma PIN chi co toi da 4 ky tu");
    } else if (KiemTraSL(so) < 4) {
      throw new PINException("Ma PIN phai co 4 ky tu");
    } else {
      System.out.println("Ma PIN hop le");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao ma PIN: ");
    String maPin = sc.nextLine();
    try {
      KiemTraPIN(maPin);
    } catch (PINException e) {
      e.printStackTrace();
    }
    sc.close();
  }
}
