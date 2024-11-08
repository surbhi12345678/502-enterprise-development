package com.springcore.lifecycle;

public class department {

	private String dname;
	
	public department() {
		// TODO Auto-generated constructor stub
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "department [dname=" + dname + "]";
	}
	
	public void init() {
		System.out.println("Init Department");
	}
	
	public void destroy() {
		System.out.println("Destroy Department");
	}

}
