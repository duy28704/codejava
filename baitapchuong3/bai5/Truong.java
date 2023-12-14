package baitapchuong3.bai5;

public class Truong {
	private String ten ;
	private String diaChi;
	private String hieuTruong;
	public Truong() {
		
	}
	public String getTen() {
		return ten;
	}
	
	
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getHieuTruong() {
		return hieuTruong;
	}
	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}

	public String toString() {
		return "ten=" + ten + ", diaChi=" + diaChi + ", hieuTruong=" + hieuTruong + "]";
	}

}
