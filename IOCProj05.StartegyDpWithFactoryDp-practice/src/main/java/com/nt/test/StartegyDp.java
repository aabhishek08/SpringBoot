package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.Flipkartfactory;

public class StartegyDp {
public static void main(String args[]) throws Exception{
	try {
		Flipkart fkpt=Flipkartfactory.createsll("dhl");
		String s=fkpt.Shopping(new String[] {"abhi","raju"},new float[] {1,23});
		System.out.println(s);		
	}
	catch(Exception e) {
		e.printStackTrace();
}
}}
