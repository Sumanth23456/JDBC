package com.abc.JDBCDemo.model;

 

public class Student {

 

    private int sid,marks;

    private String sname,city;
    

    @Override
	public String toString() {
		return "Student [sid=" + sid + ", marks=" + marks + ", sname=" + sname + ", city=" + city + "]";
	}

	public int getSid() {

        return sid;

    }

    public void setSid(int sid) {

        this.sid = sid;

    }

    public int getMarks() {

        return marks;

    }

    public void setMarks(int marks) {

        this.marks = marks;

    }

    public String getSname() {

        return sname;

    }

    public void setSname(String sname) {

        this.sname = sname;

    }

    public String getCity() {

        return city;

    }

    public void setCity(String city) {

        this.city = city;

    }

    

    

    

}