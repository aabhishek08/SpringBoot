package com.nt.beans;

public class A {
	private B b;

	public A() {
		System.out.println("A-0-param Constructer");
	}

	public void setInt(B b) {
		System.out.println("A.setB()");
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}


}
