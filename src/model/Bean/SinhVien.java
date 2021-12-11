package model.Bean;

public class SinhVien {
	private String masv;
	private String hoten;
	private String gioitinh;
	private String khoa;
	
	public SinhVien() {
	}

	
	
	public SinhVien(String masv, String hoten, String gioitinh, String khoa) {
		this.masv = masv;
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.khoa = khoa;
	}



	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
}
