package com.nt.beans;

public class B {
	private A a;
	public B() {
		System.out.println("B-0 param constructer");
	}
	public B(A a) {
		System.out.println("B-1 param constructer");
		this.a=a;
	}
	@Override
	public String toString() {
		return "B [a]="+a;
	}

}
