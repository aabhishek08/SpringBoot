package com.nt.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comp.Courier;
import com.nt.comp.Flipkart;

public class Flipkartfactory {
	private static Properties props;
	static {
		try {
			//Load properties file
			FileInputStream fis=new FileInputStream("src/main/java/com/nt/commons/Info.properties");
			//load properties file content to java.util.properties class obj
			props=new Properties();
			props.load(fis);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
//static factory method supporting Factory pattern
	public static Flipkart createFlipkart() throws Exception  {
		//create target class obj
		Flipkart fpkt=new Flipkart();
//load dependencies
		Class c=Class.forName(props.getProperty("dependent.comp"));
				//create using reflection object
		Constructor cons[]=c.getDeclaredConstructors();
		//craete object
		Courier courier=(Courier )cons[0].newInstance();
		//set dependent class object to target class obj
		fpkt.setCourier(courier);
		return fpkt;
	}
}