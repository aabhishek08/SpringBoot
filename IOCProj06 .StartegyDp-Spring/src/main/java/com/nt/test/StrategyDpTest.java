package com.nt.test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Flipkart;
public class StrategyDpTest {
public static void main(String args[]) {
	DefaultListableBeanFactory factory=new DefaultListableBeanFactory(); 
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory); 
reader.loadBeanDefinitions("com/nt/cfgs/applicationcontext.xml");
Flipkart fpkt=factory.getBean("fpkt",Flipkart.class);
String result=fpkt.shopping(new String[] {"shirt","trouser","mobile"},
		new float[] {3400.0f,5600.0f,6000.0f});
System.out.println(result);
}
}

