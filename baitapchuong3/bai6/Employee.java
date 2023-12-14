package baitapchuong3.bai6;

public class Employee extends Person{
	private String employerName ;
	private String dateHired;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	public String toString() {
		return super.toString() + "employerName=" + employerName + ", dateHired=" + dateHired + "";
	}

}
