package baitap6;

import java.time.LocalDate;

public class HangThucPham extends HangHoa {
	private String nhaCungCap;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	public HangThucPham(String maHang) {
		super(maHang);
		this.nhaCungCap = "";
		this.ngaySanXuat = LocalDate.now();
		this.ngayHetHan = ngaySanXuat;
		
}
	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon) {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaCungCap(nhaCungCap);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(ngaySanXuat.isAfter(LocalDate.now()))
			throw new IllegalArgumentException("Ngay san xuat phai truoc ngay hien tai");
		this.ngaySanXuat = ngaySanXuat;
	}
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if(ngayHetHan.isBefore(ngaySanXuat))
			throw new IllegalArgumentException("Ngay het han phai sau ngay san xuat");
		this.ngayHetHan = ngayHetHan;
	}
	@Override
	public double getTienVAT() {
		return donGia * 0.05;
	}

	@Override
	public String danhGia() {
		LocalDate now = LocalDate.now();
		return (soLuongTon > 0 && ngayHetHan.isBefore(now) ? "Kho ban" : "");
		
	}
