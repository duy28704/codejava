package baitapchuong3.bai5;

public class SinhVien extends Nguoi{
	private String lop ;
	private String nganh ;
	private Truong truong;
	public SinhVien() {
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public Truong getTruong() {
		return truong;
	}
	public void setTruong(Truong truong) {
		this.truong = truong;
	}
	public String toString() {
		return "SinhVien " + super.toString() + "lop=" + lop + ", nganh=" + nganh + ", truong=" + truong + " ";
	}

}
