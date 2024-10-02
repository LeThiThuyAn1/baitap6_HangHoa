package baitap6;

public class HangDienMay extends HangHoa{
	
	private int thoiGianBH;
	private double congSuat;
	
	public HangDienMay(String maHang) {
		super(maHang);
		this.thoiGianBH = 0;
		this.congSuat = 0.0;
	}
	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBH, double congSuat) {
		super(maHang, tenHang, donGia, soLuongTon);
		setThoiGianBH(thoiGianBH);
		setCongSuat(congSuat);
		// this.thoiGianBH = thoiGianBH;
		// this.congSuat = congSuat;
	}
	public int getThoiGianBH() {
		return thoiGianBH;
	}
	public void setThoiGianBH(int thoiGianBH) {
		if(thoiGianBH < 0) {
			throw new IllegalArgumentException("Thoi gian bao hanh phai >= 0");
			this.thoiGianBH = thoiGianBH;
		}
	}
		public double getCongSuat() {
			return congSuat;
	}
		public void setCongSuat(double congSuat) {
			if(congSuat < 0) {
				throw new IllegalArgumentException("Cong suat phai >= 0");
				this.congSuat = congSuat;
			}
		}
	@Override double getTienVAT() {
		return donGia * 0.1;
	}

	@Override
	public String danhGia() {
		return soLuongTon < 3 ? "ban duoc" : "";
	}
		}
	