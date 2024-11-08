package com.SC.CI;

public class Employee {
	private int eid;
	private String ename;
	private int esal;
	private Address addr;
	public Employee(int eid, String ename, int esal, Address addr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.addr = addr;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", addr=" + addr + "]";
	}
		
}
