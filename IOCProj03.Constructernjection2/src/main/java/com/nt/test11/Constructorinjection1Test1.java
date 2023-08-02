package com.nt.test11;
	import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans1.WishmessageGenerater;

	public class Constructorinjection1Test1 {

		public static void main(String[] args) {
					//Hold spring bean cfg file name and location
				ClassPathResource res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
			//create ioc container (BeanFactory container)
					XmlBeanFactory factory=new XmlBeanFactory(res);
					//get Target spring bean class object
					WishmessageGenerater generater=factory.getBean("wmg",WishmessageGenerater.class);;
					String result=generater.generateMessage("Abhi");
					System.out.println("wishme message is::"+result);
			}
	} 
