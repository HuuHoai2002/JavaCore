package BaiTapChuong4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Nghiêm Hữu Hoài , msv: 2021050273
public class Bai4 {
	static void PrintString(HashSet<String> hashSetStrings) {
		for (String string : hashSetStrings) {
			System.err.println(string + " ");
		}
	}
	static void PrintSringWithIterator(Iterator<String> listIterator) {
		while (listIterator.hasNext()) {
			System.err.print(listIterator.next() + " ");
		}
	}
	static boolean checkContains(HashSet<String> hashSetStrings, String name) {
		if(hashSetStrings.contains(name)) return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<String> hashSetStrings = new HashSet<>();
		System.out.println("Nhập vào số lượng trái cây : ");
		int soluong = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < soluong; i++) {
			System.out.println("Nhập vào trái cây thứ " + (i + 1) + " :");
			String name = scanner.nextLine();
			if(!checkContains(hashSetStrings, name)) {
				hashSetStrings.add(name);
			}
		}
		System.out.println("Số trái cây vừa nhập là : ");
		PrintString(hashSetStrings);
		System.out.println("Nhập vào tên loại trái cây bất kỳ : ");
		String name2 = scanner.nextLine();
		if(checkContains(hashSetStrings, name2)) {
			System.err.println(name2 + " có ở trong hashSetStrings");
		} else {
			System.err.println(name2 + " không có ở trong hashSetStrings");
		}
		System.out.println("Nhập vào tên trái cây cần xóa: ");
		String name3 = scanner.nextLine();
		if(checkContains(hashSetStrings, name3)) {
			hashSetStrings.remove(name3);
			System.out.println("hashSetString sau khi xóa đi trái " + name3 + " là:");
			PrintString(hashSetStrings);
		} else {
			System.out.println("Không thể xóa trái " + name3 + " vì không tồn tại trong hashSetStrings");
		}
		
		// Tạo mới 1 list
		List<String> listStrings = new LinkedList<>();
		// Thêm 1 phần tử
		listStrings.add("Hihi HaHa");
		// Thêm listStrings vào hashSetStrings
		hashSetStrings.addAll(listStrings);
		Iterator<String> listIterator = hashSetStrings.iterator();
		System.out.println("hashSetString sau khi thêm listStrings vào là: " );
		PrintSringWithIterator(listIterator);
		System.out.println();
		hashSetStrings.removeAll(listStrings);
		System.out.println("hashSetString sau khi xóa các phần tử thuộc listStrings là : ");
		PrintSringWithIterator(listIterator);
		scanner.close();
	}

}
