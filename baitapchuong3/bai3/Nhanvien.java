package baitapchuong3.bai3;
import baitapchuong3.bai2.Address;
public class Nhanvien  {
			private String name;
			private Address address;
			private String dob;
			private String gender;
		
		public Nhanvien (String name , Address address , String dob , String gender) {
			this.name =name;
			this.address=address;
			this.dob=dob;
			this.gender= gender;
		}
		public Nhanvien() {
		}
		public void setAddress(Address address) {
			this.address= address ;
		}
		public Address getAddress() {
			return address;
		}
		public void setName(String name) {
			this.name=name;
			}
		
		public void setDob(String dob) {
			this.dob=dob;
			}
		public void setGender(String gender) {
			this.gender=gender;
			}
		public String getName() {
			return name ;
			}
		public String getDob() {
			return dob;
			}
		public String getGender() {
			return gender;
			}
		public String toString() {
			return "Name:"+name+"\ndob:"+dob+"\ngender:"+gender +"\naddress :" + address  ;
		}

	}


