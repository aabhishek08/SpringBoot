package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class RealtimeDITest {
/**
 * @param args
 * @throws Exception
 */
public static void main(String args[]) throws Exception {
	//create ioc container
	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
 XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
reader.loadBeanDefinitions("com/nt/cfgs/applicationcontext.xml");
//get springBean class obj ref
MainController controller=factory.getBean("controller",MainController.class);
//read inputs as string values and store them into EmployeeVO class object
Scanner sc=new Scanner(System.in);
 System.out.println("Enter the employee name::");
 String name=sc.next();
 System.out.println("Enter the employee designation::");
 String desg=sc.next();
 System.out.println("Enter the employee basicSalery::");
 String basicSalery=sc.next();
 EmployeeVO vo=new EmployeeVO();
 vo.setEname(name);
 vo.setDesg(desg);
 vo.setBasicSalery(basicSalery);
 //invoke method
 try {
	 String result=controller.processEmployee(vo);
 System.out.println(result);
 }
 catch(Exception e) {
	 e.printStackTrace();
	 throw e;
 }
 
}//main
}//classSystem.out.println("Enter the employee name");

