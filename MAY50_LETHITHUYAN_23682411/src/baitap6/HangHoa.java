package baitap6;

import java.text.Format;

import jav.text.DecimalFormat;
public abstract  class HangHoa {
	protected  final String maHang;
	protected String tenHang;
	protected double donGia;
	protected int soLuongTon;
	
	public HangHoa(String maHang) {
		this(maHang,"xxx", 0.0, 0);
		// this.maHang = maHang;
		// this.tenHang = "xxx";
		// this.donGia = 0.0;
		// this.soLuongTon = 0;
	}
	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
		this.maHang = maHang;
		if(maHang == null || maHang.trim().length()==0)
			throw new IllegalArgumentException("Ma hang hoa khong duoc de trong");
		this.maHang = maHang;
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
		//this.tenHang = tenHang;
		//this.donGia = donGia;
		//this.soLuongTon = soLuongTon;
		
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		if(tenHang == null||tenHang.trim().length()== 0) {
			throw new IllegalArgumentException("Ten khong duoc de trong");
		}
		this.tenHang = tenHang;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		if(donGia < 0) {
			throw new IllegalArgumentException("Don gia phai >=0");
			this.donGia = donGia;
	}
		}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) {
		if(soLuongTon < 0) {
			throw new IllegalArgumentException("So luong ton phai >=0");
		this.soLuongTon = soLuongTon;
	}
		}
	public String getMaHang() {
		return maHang;
	}
	public abstract double getTienVAT();
	public abstract String danhGia();
	@Override
	public String toString() {
		java.text.DecimalFormat df = new DecimalFormat("#,##).#");
		return String.format("%-10s %-20s %-10s %-10d %-10s %-10s", maHang, tenHang, df.format(donGia), soLuongTon, df.format(getTienVAT()), danhGia());
}
	public String DanhGia() {
		// TODO Auto-generated method stub
		return null;
	}