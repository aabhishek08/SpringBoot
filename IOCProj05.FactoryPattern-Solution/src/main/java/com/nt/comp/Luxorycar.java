package com.nt.comp;
public class Luxorycar extends Car{
String regdn;
	public Luxorycar(String regdn) {
		System.out.println("Luxorycar::1 parameterConstructer");
		this.regdn=regdn;
	}
	@Override
	public void drive() {
		System.out.println("Driving Luxory car");
	}

}
