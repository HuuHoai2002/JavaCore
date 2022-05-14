package Chuong5;

/*
    try {
      Các câu lệnh cần kiểm tra;
      Nếu có lỗi thì catch sẽ được thực thi;
    } catch (Exception e){
      Nếu không có lỗi của try thì catch sẽ không thực thi;
    } finally {
      Vào đây khi khối lệnh chạy xong , kể cả lỗi hay không lỗi
    }
 */
public class Try_Catch {
  static void Validate(int age) {
    if (age < 18) {
      throw new ArithmeticException("Chua du 18 tuoi");
    }
  }

  public static void main(String[] args) {
    int array[] = { 1, 2, 3, 4, 5, 6 };
    try {
      // Lỗi vì mảng chỉ có 6 phần tử
      System.out.println("Phần tử tại vị trí thứ 8888 là : " + array[8888]);
    } catch (Exception e) {
      // Sẽ chạy vào đây vì try lỗi
      e.printStackTrace();
    } finally {
      System.out.println("Kể cả lỗi hay không lỗi thì vẫn lọt vào đây");
    }
    Validate(16);
  }
}
