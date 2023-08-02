package com.nt.beans;

public class Customer {
	// mandetory properties
	private int cno;
	private String cname;
	private float billamt;
//optional properties
	private String caddrs;
	private long mobileno;
	public Customer(int cno, String cname, float billamt) {
	super();
		this.cno = cno;
		this.cname = cname;
		this.billamt = billamt;
	}

	public void setCaddrs(String caddrs) {
		this.caddrs = caddrs;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", billamt=" + billamt + ", caddrs=" + caddrs
				+ ", mobileno=" + mobileno  + "]";
	}

}
