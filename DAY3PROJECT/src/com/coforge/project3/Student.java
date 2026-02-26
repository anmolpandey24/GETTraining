package com.coforge.project3;

public class Student {
	
	private String name;
	private int sid;
	
	
	
	
	
	public Student() {
		super();
	}
	
	public Student(String name, int sid) {
		super();
		this.name = name;
		this.sid = sid;
	}
	
	private static CollegeAddress address;

	public static CollegeAddress getAddress() {
		return address;
	}

	public static void setAddress(CollegeAddress address) {
		Student.address = address;
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", sid=" + sid + "]";
	}



	static class CollegeAddress{
		private String city;
		private String state;
		private long pincode;
		public CollegeAddress(String city, String state, long pincode) {
			super();
			this.city = city;
			this.state = state;
			this.pincode = pincode;
		}
		public CollegeAddress() {
			super();
		}
		@Override
		public String toString() {
			return "CollegeAddress [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
		}
		
		
	}
	
	public static void main(String[] args) {
		
		CollegeAddress address=new Student.CollegeAddress("Hyderabad","Telanagana",500032);
		setAddress(address);
		Student s1=new Student("Anmol",123);
		setAddress(address);
		System.out.println(s1);
		Student s2=new Student("Amit",456);
		System.out.println(s2);
	}

}
