package com.nt.comp;

public class DHL implements Courier {
	public DHL() {
		System.out.println("DHL::o param Constructer");   
	}
		@Override
		public String deliver(int old) {
			// TODO Auto-generated method stub
			return old+"\n"+"order id order delivered";
		}

	}

