package com.nt.comp;

public class DTDC implements Courier {
public DTDC() {
	System.out.println("DTDC::o param Constructer");   
}
	@Override
	public String deliver(int old) {
		// TODO Auto-generated method stub
		return old+"\n"+"order id order delivered";
	}

}
