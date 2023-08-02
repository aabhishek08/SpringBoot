package com.nt.factory;

import com.nt.comp.Budgetcar;
import com.nt.comp.Car;
import com.nt.comp.Luxorycar;
import com.nt.comp.Sportscar;

public class Carfactory {
 public static Car createCar(String type,String regdNo) {
	 if(type.equalsIgnoreCase("sports"))
		 return new Sportscar(regdNo);
	 else	 if(type.equalsIgnoreCase("budget"))
		 return new Budgetcar(regdNo);
	 else if(type.equalsIgnoreCase("luxory"))
		 return new Luxorycar(regdNo);
	 else 
		 throw new IllegalArgumentException("Invalid car type");
}
}
