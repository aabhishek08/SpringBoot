package com.nt.test;

public class NewInstancee {
	public static void main(String args[]) throws Exception {
		Class c = Class.forName(args[0]);
		Class d = Class.forName(args[1]);
				Object obj1=c.newInstance();
				Object obj2=d.newInstance();

		System.out.println(obj2);
		System.out.println(obj1);
	}

}
