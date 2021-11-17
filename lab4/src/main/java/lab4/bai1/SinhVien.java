/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4.bai1;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Nghia
 */
public class SinhVien implements Comparable<SinhVien> {
    private String maSinhVien;
	private String hoVaTen;
	private int namSinh;
	private String diachi;
        private String lop;
	
	
	public SinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public SinhVien(String maSinhVien, String hoVaTen, int namSinh, String diachi,String lop) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diachi = diachi;
                this.lop = lop;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getdiachi(String diachi) {
		return diachi;
	}

	public void setdiachi(String diachi) {
		this.diachi = diachi;
	}
       public String getlop() {
		return lop;
	}
	public void setlop(String lop) {
		this.lop = lop;
	}
	
	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh
				+ ", dia chi=" + diachi + "Lop"+lop+"]";
	}

	public int compareTo(SinhVien o) {
		return this.maSinhVien.compareTo(o.maSinhVien);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lop, diachi, hoVaTen, maSinhVien, namSinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(maSinhVien, other.maSinhVien);
	}
    
}
