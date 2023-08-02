package com.nt.test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Customer;
import com.nt.beans.Employee1;
import com.nt.beans.Student;
public class SetttervsConstructerInjectionTest {
public static void main(String args[]) {
	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader=new 	XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationcontext.xml");
Employee1 emp1=factory.getBean("emp1",Employee1.class);
System.out.println(emp1);
Employee1 emp2=factory.getBean("emp2",Employee1.class);
System.out.println(emp2);
Employee1 emp3=factory.getBean("emp3",Employee1.class);
System.out.println(emp3);
Student st1=factory.getBean("stud1",Student.class);
System.out.println(st1);
Customer ct1=factory.getBean("cust1",Customer.class);
System.out.println(ct1);
}
}
