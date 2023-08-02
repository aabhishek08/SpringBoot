package com.ht.comp;
public class test {
	private int a=10;
	private String b="hello";
	public test() {
		System.out.println("Abhishek BAdapanda");
	}
	public test(int x) {
		this.a=x;
		System.out.println("Abhishek ");
	}
	
	public String toString() {
		return "test="+a+b;
	}

}
