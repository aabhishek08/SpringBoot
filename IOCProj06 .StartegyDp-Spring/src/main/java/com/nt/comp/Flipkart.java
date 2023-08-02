package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;
	public Flipkart() {
		System.out.println("Flipkart::0-paramConstructer");
	}
	public void setCourier(Courier courier ) {
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
public String shopping(String items[],float prices[]) {
	//calculate the bill amount
	float billAmt=0.0f;
	for(int i=0;i<items.length;++i)
		billAmt=billAmt+prices[i];
		//generate the order id
		int old=new Random().nextInt(1000000);
		String status=courier.deliver(old);
		String finalMsg=Arrays.toString(items)+"are purchesd with prices"+Arrays.toString(prices)+"\n"+"The generated billamount"+billAmt;
	return finalMsg+"::"+status;
}
}
