package com.nt.test;
import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.Controller.Maincontroller;
import com.nt.VO.CustomerVo;

public class RealtimeDiCustomerTest {
public static void main(String args[]) {
	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationcontext.xml");
	Maincontroller controller=factory.getBean("controller",Maincontroller.class);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Name:");
	String Sname=sc.next();
	System.out.println("Enter the item1 price:");
	String Itemprice1=sc.next();
	System.out.println("Enter the item2 price:");
	String Itemprice2=sc.next();
	CustomerVo vo=new CustomerVo();
	vo.setCname(Sname);
	vo.setcItem1(Itemprice1);
	vo.setcItem2(Itemprice2);
	try {
		String result=controller.processCustomer(vo);
		System.out.println(result);
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println(e);
	}
	
	
}
}
