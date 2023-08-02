package com.nt.test11;
	import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans1.WishmessageGenerater;

	public class Constructorinjection1Test2 {

		public static void main(String[] args) {
			//create ioc container 
			DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
					 XmlBeanDefinitionReader reader=new  XmlBeanDefinitionReader(factory);
					 reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
					//get Target spring bean class object
					WishmessageGenerater generater=factory.getBean("wmg",WishmessageGenerater.class);;
					String result=generater.generateMessage("Abhi");
					System.out.println("wishme message is::"+result);
			}
	} 
