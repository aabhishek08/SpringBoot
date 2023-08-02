package com.nt.factory;

import com.nt.comp.Courier;
import com.nt.comp.DHL;
import com.nt.comp.Flipkart;

public class Flipkartfactory {
public static Flipkart createsll(String couriertype) {
	Flipkart fkpt=new Flipkart();
	Courier courier=null;
	if(couriertype.equalsIgnoreCase("DHL")) 
		courier=new DHL();
	else throw new IllegalArgumentException("Invalid courier type");

fkpt.setCourier(courier);
return fkpt;
}}
