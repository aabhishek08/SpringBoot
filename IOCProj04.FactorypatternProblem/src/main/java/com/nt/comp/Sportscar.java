package com.nt.comp;

public class Sportscar extends Car{
	
	String regdn;
	public Sportscar(String regdn) {
		System.out.println("Sportscar::1 parameterConstructer");
		this.regdn=regdn;
	}
	@Override
	public void drive() {
		System.out.println("Driving Sports car");
	}

}
