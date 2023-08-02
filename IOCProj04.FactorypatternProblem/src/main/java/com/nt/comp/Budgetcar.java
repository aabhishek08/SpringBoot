package com.nt.comp;
public class Budgetcar extends Car{
String regdn;
	public Budgetcar(String regdn) {
		System.out.println("Budgetcar::1 parameterConstructer");
		this.regdn=regdn;
	}
	@Override
	public void drive() {
		System.out.println("Driving Budget car");
	}

}
