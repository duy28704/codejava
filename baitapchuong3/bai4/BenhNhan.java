package baitapchuong3.bai4;

public class BenhNhan extends Nguoi {
	private String tiensu;
	private String chuandoan;
	private BenhVien benhVien;
	public BenhNhan() {
		
	}
	public String getTiensu() {
		return tiensu;
	}
	public void setTiensu(String tiensu) {
		this.tiensu = tiensu;
	}
	public String getChuandoan() {
		return chuandoan;
	}
	public void setChuandoan(String chuandoan) {
		this.chuandoan = chuandoan;
	}
	public BenhVien getBenhVien() {
		return benhVien;
	}
	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}

	public String toString() {
		return "BenhNhan " + super.toString()+" tiensu=" + tiensu + ", chuandoan=" + chuandoan + ", benhVien=" + benhVien + "]";
	}

}
