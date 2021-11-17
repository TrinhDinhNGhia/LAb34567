/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4.bai1;
import java.util.Date;

import java.util.ArrayList;

/**
 *
 * @author Nghia
 */
public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;
		
	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
		}
	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
		}
	public void themSinhVien(SinhVien sv) {
			this.danhSach.add(sv);
		}
	public void inDanhSachSinhVien() {
	  for (SinhVien sinhVien : danhSach) {
		System.out.println(sinhVien);
		 }
		}
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
		}
	public int laySoLuongSinhVien() {
			return this.danhSach.size();
		}
	public void lamRongDanhSach() {
			this.danhSach.removeAll(danhSach);
		}
	public boolean xoaSinhVien(SinhVien sv) {
			return this.danhSach.remove(sv);
		}
	public void timSinhVien(String lct) {
		for (SinhVien sinhVien : danhSach) {
		if(sinhVien.getlop().indexOf(lct)>=0) {
			System.out.println(sinhVien);
				}
			}
		}
          
}
