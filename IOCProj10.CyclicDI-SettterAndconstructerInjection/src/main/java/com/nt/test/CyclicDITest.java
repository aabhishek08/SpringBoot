package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.A;
import com.nt.beans.B;

public class CyclicDITest {
public static void main(String args[]) {
	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationcontext.xml");
	A aa=factory.getBean("a1",A.class);
	System.out.println(aa);
	B bb=factory.getBean("b1",B.class);
	System.out.println(bb);
}
}
