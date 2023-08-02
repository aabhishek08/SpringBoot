package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;
public void setCourier(Courier courier) {
	this.courier=courier;
}
public String Shopping(String items[],float prices[]) {
float billAmt=00.0f;
for(int i=0;i<items.length;i++)
	billAmt=billAmt+prices[i];
 int old=new Random().nextInt(100000000);
 String msg=courier.deliver(old);
 String status=Arrays.toString(items)+"price of"+Arrays.toString(prices)+"\nTotal price "+billAmt;
 return status+"\n"+msg;
}
}
