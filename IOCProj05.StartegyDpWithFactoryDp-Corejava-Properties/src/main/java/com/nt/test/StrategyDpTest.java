package com.nt.test;
import com.nt.comp.Flipkart;
import com.nt.factory.Flipkartfactory;

public class StrategyDpTest {
public static void main(String args[]) {
	try {
		//get target class object form Factory
		Flipkart fpkt=Flipkartfactory.createFlipkart();
		//invoke the b.method
		String result=fpkt.shopping(new String[] {"shirt","trouser","mobile"},
				new float[] {3400.0f,5600.0f,6000.0f});
		System.out.println(result);
	}//try
	catch(Exception e) {
		e.printStackTrace();
	}
}//main

}//class
