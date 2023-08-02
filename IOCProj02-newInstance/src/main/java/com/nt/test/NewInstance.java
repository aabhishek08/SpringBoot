package com.nt.test;

import java.lang.reflect.Constructor;

public class NewInstance {
public static void main(String args[]) throws Exception {
	Class c=Class.forName(args[0]);
	//Class d=Class.forName(args[1]);
	//load the constructer
Constructor	cons[]=c.getDeclaredConstructors();
	//create the objects loaded class
	Object obj1=cons[0].newInstance();
	System.out.println(obj1);
	Object obj3=cons[1].newInstance(3);
	
	//Object obj2=d.newInstance();
	System.out.println(obj3);
	System.out.println(obj1.toString());
	
	}
}
