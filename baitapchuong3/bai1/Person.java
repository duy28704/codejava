package baitapchuong3.bai1;
public class Person {
		private String name;
		private String dob;
		private String pob;
		private String gender;
		private String email;
		private String phone;

		public Person() {

		}

		public Person(String name, String dob, String pob, String gender, String email, String phone) {
			this.name = name;
			this.dob = dob;
			this.pob=pob;
			this.gender = gender;
			this.email=email;
			this.phone=phone;
			
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public void setPob(String pob) {
			this.pob = pob;
		}

		public void setGender(String gender) {
			this.gender = gender;
			
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getName() {
			return name;
		}

		public String getDob() {
			return dob;
		}

		public String getPob() {
			return pob;
		}

		public String getGender() {
			
			return gender;
		}

		public String getEmail() {
			return email;
		}

		public String getPhone() {
			return phone;
		}

		public String toString() {
			String genderString = getGenderString();
			return "Ten:" + name + "\ndob:" + dob + "\npob:" + pob + "\ngender:" + genderString + "\nemail:" + email + "\nphone:" + phone;
		}
		private String getGenderString() {
	        if ("M".equalsIgnoreCase(gender)) {
	            return "Nam";
	        } else if ("F".equalsIgnoreCase(gender)) {
	            return "Nữ";
	        } else {
	            return "Không xác định";
	        }
		}
		
	}


