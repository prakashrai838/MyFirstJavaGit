package org;

import java.util.Date;

public class Main {

private String fname="";
private String lname="";
private Date dob;

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public Date getDob() {
	return dob;
}

public void setDob(Date dob) {
	this.dob = dob;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj1 = new Main();
		obj1.setFname("LEO");
		obj1.setLname("MESSI");
		System.out.println("First Name is : " +obj1.getFname());
		System.out.println("Last Name is : " +obj1.getLname());
	}

}
