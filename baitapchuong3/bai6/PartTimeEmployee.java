package baitapchuong3.bai6;

public class PartTimeEmployee extends Employee {
	private int hoursPerWeek;
	public PartTimeEmployee() {
		
	}
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	@Override
	public String toString() {
		return "PartTimeEmployee" + super.toString()+"hoursPerWeek=" + hoursPerWeek + "]";
	}

}
