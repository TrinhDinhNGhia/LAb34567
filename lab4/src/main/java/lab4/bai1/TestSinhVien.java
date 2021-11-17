/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4.bai1;

import java.util.Scanner;

/**
 *
 * @author Nghia
 */
public class TestSinhVien {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon = 0;
		do {
	System.out.println("MENU ---------- ");
	System.out.println("Vui lòng chọn chức năng: ");
	System.out.println("1.Thêm sinh viên vào danh sách.\n"
	+ "2.	In danh sách sinh viên ra màn hình.\n"
	+ "3.	Kiểm tra danh sách có rỗng hay không.\n"
	+ "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
	+ "5.	Làm rỗng danh sách sinh viên.\n"
	+ "6.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
	+ "7.	Hiển thị các sinh viên từ 1 lớp nhập từ bàn phím.\n"
	+ "0.   Thoát khỏi chương trình");
		luaChon = sc.nextInt();
		sc.nextLine();
		if(luaChon==1) {
		System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
		System.out.println("Nhập họ và tên: "); String hoVaTen = sc.nextLine();
		System.out.println("Nhập năm sinh: "); int namSinh = sc.nextInt();
		System.out.println("Nhập điểm dia chi: "); String diachi = sc.nextLine();
                System.out.println("Nhập lớp: "); String lop=sc.nextLine();
		SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diachi,lop);
		dssv.themSinhVien(sv);
				
		}else if(luaChon==2) {
		   dssv.inDanhSachSinhVien();
		}else if(luaChon==3) {
		   System.out.println("Danh sách rỗng: "+ dssv.kiemTraDanhSachRong());
		}else if(luaChon==4) {
		   System.out.println("Số lượng hiện tại: "+ dssv.laySoLuongSinhVien());
		}else if(luaChon==5) {
		   dssv.lamRongDanhSach();
		}else if(luaChon==6) {
		   System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
		   SinhVien sv = new SinhVien(maSinhVien);
		   System.out.println("Xóa sinh viên trong danh sách: "+dssv.xoaSinhVien(sv));
		}else if(luaChon==7) {
		System.out.println("Nhập lớp cần tìm: "); String lop = sc.nextLine();
		System.out.println("Kết quả tìm kiếm: ");
		dssv.timSinhVien(lop);		
		}
		}while(luaChon!=0);
    
    }
}
