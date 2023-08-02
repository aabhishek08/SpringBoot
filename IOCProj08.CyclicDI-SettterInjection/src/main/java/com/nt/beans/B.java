package com.nt.beans;

public class B {
	private A a;
	public B() {
		System.out.println("B-0 param constructer");
	}
	public void setInt(A a) {
		System.out.println("B.setA()");
		this.a=a;
	}
	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}
	


}
