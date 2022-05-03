package BaiTapChuong3.Bai4;

import java.util.Scanner;

public class Main extends Contact {
	
	@Override
	void NhapContact() {
		System.out.println("Nhap vao ten: ");
		ten = sc.nextLine();
		System.out.println("Nhap vao so dien thoai: ");
		soDienThoai = sc.nextLine();
	}

	@Override
	void XuatContact() {
		System.out.println("Ten: " + ten);
		System.out.println("So dien thoai: " + soDienThoai);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luachon;
		Main arrContact[] = new Main[100];
		int index = 0;
		do {
			System.out.println("\n\t\t\t1: Nhap moi mot contact");
			System.out.println("\n\t\t\t2: Xem contact hien co");
			System.out.println("\n\t\t\t3: Xoa mot contact");
			System.out.println("\n\t\t\t4: Tim kiem theo ten");
			System.out.println("\n\t\t\t5: Cap nhat so dien thoai");
			System.out.println("\n\t\t\t6: Thoat chuong trinh");
			System.out.print("Nhap mot lua chon: \t");
			luachon = Integer.parseInt(sc.nextLine());
			switch (luachon) {
			case 1: {
				System.out.println();
				System.out.println("Them contact thu : " + (index + 1));
				arrContact[index] = new Main();
				arrContact[index].NhapContact();
				index++;
				break;
			}
			case 2: {
				if (index == 0) {
					System.err.println("Danh ba trong");
				} else {
					System.out.println();
					System.err.println("Hien co " + (index) + " contact trong danh ba");
					for (int i = 0; i < index; i++) {
						System.out.println("Contact " + (i + 1));
						arrContact[i].XuatContact();
					}
				}
				break;
			}
			case 3: {
				if (index == 0) {
					System.err.println("Khong the xoa vi danh ba trong");
				} else {
					System.out.println();
					System.out.println("Nhap vao so dien thoai cua contact can xoa: ");
					String sodt = sc.nextLine();
					boolean check = false;
					int indexStd = 0;
					for (int i = 0; i < index; i++) {
						if (arrContact[i].soDienThoai.equals(sodt)) {
							check = true;
							indexStd = i;
						}
					}
					if (!check) {
						System.err.println("Khong co co dien thoai nay o trong danh ba");
					} else {
						System.out.println();
						for (int i = indexStd; i < index; i++) {
							arrContact[i] = arrContact[i + 1];
						}
						index--; // Xoa phai giam di index
						System.err.println("Da xoa contact voi so dien thoai : " + sodt);
					}
				}
				break;
			}
			case 4: {
				if (index == 0) {
					System.err.println("Danh ba trong");
				} else {
					System.out.println();
					System.out.println("Nhap vao ten cua contact can tim: ");
					String ten = sc.nextLine();
					boolean check = false;
					for (int i = 0; i < index; i++) {
						if (arrContact[i].ten.equalsIgnoreCase(ten)) {
							check = true;
						}
					}
					if (!check) {
						System.err.println(
								"Ten : " + ten.toUpperCase() + " khong co o trong danh ba , vui long kiem tra lai");
					} else {
						System.out.println();
						System.out.println("So dien thoai cua nhung nguoi co ten  " + ten.toUpperCase() + " la: ");
						for (int i = 0; i < index; i++) {
							if (arrContact[i].ten.equalsIgnoreCase(ten)) {
								System.out.println();
								arrContact[i].XuatContact();
							}
						}
					}
				}
				break;	
			}
			case 5: {
				if (index == 0) {
					System.out.println("Khong the cap nhat vi chua co thong tin");
				} else {
					System.out.println();
					System.err.println("Hien co " + (index) + " contact trong danh ba");
					for (int i = 0; i < index; i++) {
						System.out.println("Contact " + (i + 1));
						arrContact[i].XuatContact();
					}
					System.out.println("\nBan muon sua contact nao ?:  ");
					int contact = Integer.parseInt(sc.nextLine());
					if (contact <= index) {
						System.out.println("Nhap vao so dien thoai moi: ");
						String stdMoi = sc.nextLine();
						arrContact[contact - 1].setSoDienThoaiString(stdMoi);
					} else {
						System.out.println("Hien tai chua co contact nay");
					}
				}
				break;
			}
			default:
				break;
			}
		} while (luachon != 6);
		sc.close();
	}
}