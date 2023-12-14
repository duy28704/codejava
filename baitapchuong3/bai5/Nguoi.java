package baitapchuong3.bai5;

public class Nguoi {
	private String ten ;
	private int tuoi ;
	private String gioitinh ;
	
	public Nguoi() {
		
	}
	public Nguoi(String ten, int tuoi, String gioitinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String toString() {
		return " [ten=" + ten + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh ;
	}
}