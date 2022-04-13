package OOP.Interface;

/* 1 : Interface không thể khởi tạo đối tượng , không có contructor, interface có thể extends được nhiều lớp
   2 : Tất cả các phương thức trong interface đều là abstract method mà không cần khai báo
   3 : Các thuộc tính trong interface luôn ở dạng public static final mà không cần khai
       báo , yêu cầu phải có giá trị
   4 : Mặc định 1 pthức trong interface đều là trừu tượng , nên chỉ có thể khai báo pthức
	   ở lớp interface và định nghĩa tại lớp implements
   4 : Có đa kế thừa , giống mixin trong Dart
*/

interface TruuTuong {
  void HienThi(); // Mặc định pt này là trừu tượng (abstract method)
}

interface TruuTuong2 {
  String info = "Da ke thua trong interface"; // public static final

  void HienThi2(); // Mặc định pt này là trừu tượng (abstract method)
}

// Đa kế thừa
public class DemoInterface implements TruuTuong, TruuTuong2 {
  // Định nghĩa lại (ghi đè) (TruuTuong)
  @Override
  public void HienThi() {
    System.out.println("Interface trong Java");
  }

  // Định nghĩa lại (ghi đè) (TruuTuong2)
  @Override
  public void HienThi2() {
    System.out.println(info);
  }

  public static void main(String[] args) {
    DemoInterface dt = new DemoInterface();
    dt.HienThi();
    dt.HienThi2();
  }
}
