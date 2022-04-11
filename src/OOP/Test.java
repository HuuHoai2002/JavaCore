package OOP;

import java.util.Scanner;

class SinhVienTest {
  private String name;
  private int age;

  public SinhVienTest(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public SinhVienTest() {
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "{" +
        " name='" + getName() + "'" +
        ", age='" + getAge() + "'" +
        "}";
  }

  public void Nhap() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập vào tên sinh viên: ");
    name = sc.nextLine();
    System.out.println("Nhập vào tuổi: ");
    age = Integer.parseInt(sc.nextLine());
    sc.close();
  }

  public void Xuat() {
    System.out.println("Thông tin vừa nhập là : " + toString());
  }
}

public class Test {
  public static void main(String[] args) {
    SinhVienTest sv1 = new SinhVienTest();
    sv1.setName("Hoài");
    sv1.setAge(20);
    sv1.Xuat();
  }
}
