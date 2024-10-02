package baitap6;

import java.time.LocalDate;

public class DanhSachHangHoa {
private static void khoiTaoDS(DanhSachHangHoa ds) {
	ds.them(new HangThucPham("TP001","Sua", 8000.0, 10, "Vinamilk", LocalDate.of(2023, 10, 1), LocalDate.of(2024, 9, 1)));
	ds.them(new HangThucPham("TP002","Gao", 18000.0, 10, "Song Lam", LocalDate.of(2023, 10, 1), LocalDate.of(2024, 9, 1)));
	ds.them(new HangThucPham("TP003","Muoi", 7000.0, 10, "Nha Trang Store", LocalDate.of(2023, 10, 1), LocalDate.of(2024, 9, 1)));
	ds.them(new HangThucPham("TP004","Duong", 21000.0, 10, "Duong Bien Hoa", LocalDate.of(2023, 10, 1), LocalDate.of(2024, 9, 1)));

	ds.them(new HangDienMay("DM001","TiVi", 8_000_000.0, 10, 24, 1500.0));
	ds.them(new HangDienMay("DM002","Ban ui", 200_000.0, 10, 6, 2000.0));
	
	}

}

