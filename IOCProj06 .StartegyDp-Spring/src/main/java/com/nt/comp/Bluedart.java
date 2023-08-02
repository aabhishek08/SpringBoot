package com.nt.comp;

public class Bluedart implements Courier {
public Bluedart() {
	System.out.println("Bluedart::0 param Constructer");
}
@Override
public String deliver(int old) {
	return old+"orderid delivered";
}
}